#!/bin/bash
read -p "Enter a string: " n
r=$(echo "$n" | rev)
if [ "$r" = "$n" ]
then
echo $n "is a palindrome"
else
echo $n "is not a palindrome"
fi

