#!/bin/bash
read -p "Enter a file name: " file1
echo "Enter contents of $file1: "
cat > $file1
read -p "Enter a pattern to search in file: " p
grep -ni $p $file1
