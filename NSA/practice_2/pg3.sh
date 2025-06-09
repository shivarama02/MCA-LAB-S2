#!/bin/bash
if [ $# -eq 1 ]
then
who > user.1st
echo "$1 user is logged at"
grep -c $1 user.1st
else
echo "please enter user name"
fi
