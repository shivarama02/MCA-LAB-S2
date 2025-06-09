#!/bin/bash
read -p "Enter a file name: " file1
echo "Enter contents of the file: "
cat > $file1
read -p "Enter line number: " n
echo "Start printing from line $n"
tail +$n $file1
