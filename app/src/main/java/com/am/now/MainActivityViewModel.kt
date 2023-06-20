package com.am.now

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.am.now.core.data.repository.UserDataRepository
import com.am.now.model.data.UserData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    userDataRepository: UserDataRepository,
) : ViewModel() {
    val uiState: StateFlow<MainActivityUIState> = userDataRepository.userData.map {
        MainActivityUIState.Success(it)
    }.stateIn(
        scope = viewModelScope,
        initialValue = MainActivityUIState.Loading,
        started = SharingStarted.WhileSubscribed(5_000),
    )
}


sealed interface MainActivityUIState {
    object Loading : MainActivityUIState
    data class Success(val userData: UserData) : MainActivityUIState
}
