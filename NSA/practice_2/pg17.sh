#!/bin/bash
read -p "Enter a file name: " file1
echo "Enter the contents of the file: "
cat > "$file1"
read -p "Enter a file name to store vowels: " file2
grep -o -i "[aeiou]" "$file1" > "$file2"
echo "The stored vowels in $file2: "
cat "$file2"
count=$(wc -l < "$file2")
echo "total no. of vowels: $count"
