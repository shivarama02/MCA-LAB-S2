#!/bin/bash
read -p "Enter a sting: " str
vowels=$( echo "$str" | grep -o -i "[aeiou]")
echo "vowels : $vowels"
count=$( echo "$vowels" | wc -l)
echo "vowels count: $count"
