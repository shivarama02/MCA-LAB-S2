#!/bin/bash
read -p "Enter directory name you want to count files: " dir
direct="$(pwd)/$dir"
if [ -d $direct ]
then
num=$(find $direct -type f | wc -l)
echo "There are $num files in $dir"
else
echo "$dir is not a directory"
fi
