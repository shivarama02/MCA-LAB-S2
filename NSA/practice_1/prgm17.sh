#!/bin/bash
read -p "Enter a file name: " file1
echo "Enter contents of $file1: "
cat > $file1
read -p "Enter line number: " l
echo "Start printing from line $l"
tail +$l $file1
