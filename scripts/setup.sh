#!/bin/bash

GIT_DIR=$(git rev-parse --git-dir 2> /dev/null)
GIT_ROOT=$(git rev-parse --show-toplevel 2> /dev/null)

echo "Installing git pre-commit hook"
echo
mkdir -p "${GIT_DIR}/hooks/"
cp "${GIT_ROOT}/scripts/pre-commit" "${GIT_DIR}/hooks/pre-commit" \
  && chmod +x "${GIT_DIR}/hooks/pre-commit"

echo "Installing git pre-push hook"
echo
mkdir -p "${GIT_DIR}/hooks/"
cp "${GIT_ROOT}/scripts/pre-push" "${GIT_DIR}/hooks/pre-push" \
  && chmod +x "${GIT_DIR}/hooks/pre-push"

cat <<-EOF
Checking the following settings helps avoid miscellaneous issues:
  * Settings -> Editor -> General -> Remove trailing spaces on: Modified lines
  * Settings -> Editor -> General -> Ensure every file ends with a line break
  * Settings -> Editor -> General -> Auto Import -> Optimize imports on the fly (for both Kotlin\and Java)
EOF
