#!/bin/bash
read -p "Enter 2 numbers: " a b
n1=$a
n2=$b
while [ $b -ne 0 ]
do
temp=$b
b=$((a % b))
a=$temp
done
gcd=$a
lcm=$(( (n1 * n2) / gcd ))
echo "GCD of $n1 and $n2 is $gcd"
echo "LCM of $n1 and $n2 is $lcm"
