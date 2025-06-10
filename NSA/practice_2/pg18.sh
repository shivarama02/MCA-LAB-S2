#!/bin/bash
read -p "Enter 2 number: " a b
while true
do
echo "1.Addition"
echo "2.Substraction"
echo "3.Multiplication"
echo "4.Division"
echo "5.Exit"
read -p "Enter a operation: " op
case $op in
1)
ans=$( echo "$a + $b" | bc);;
2)
ans=$( echo "$a - $b" | bc);;
3)
ans=$( echo "$a * $b" | bc);;
4)
ans=$( echo "scale=3; $a / $b" | bc);;
5)
exit;;
*)
echo "Invalid option!"
esac
echo "$a + $b = $ans"
done
