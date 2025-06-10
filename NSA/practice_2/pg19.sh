#!/bin/bash
read -p "Enter a string: " str
read -p "Enter word to search: " n
var=$( echo "$str" | grep -o -i "$n" | wc -l )
echo "$var"
