#!/bin/bash
read -p "Enter a file name: " file1
echo "Enter contents of $file: "
cat > $file1
read -p "Enter a pattern to search in file: " s
grep -ni $s $file1
