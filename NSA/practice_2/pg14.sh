#!/bin/bash
read -p "Enter a number: " n
no=$n
rev=0
rem=0
while [ $n -gt 0 ]
do
rem=$(($n % 10))
rev=$(($rev * 10 + $rem))
n=$(($n / 10))
done
if [ $rev -eq $no ]
then
echo $no "is a palindrome"
else
echo $no "is not a palindrome"
fi
