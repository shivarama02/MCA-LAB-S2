#!/bin/bash
read -p "Enter a number: " n
if [ $(( n % 2 )) -eq 0 ]
then
echo $n " is even number"
else
echo $n " is odd number"
fi
