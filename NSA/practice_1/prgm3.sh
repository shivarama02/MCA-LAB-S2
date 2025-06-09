#!/bin/bash
if [ $# -eq 1 ]
then
who > user.1st
echo "$1 User is Logged at"
grep -c $1 user.1st
else
echo "pls Enter username"
fi
