#!/bin/bash
read -p "Enter name of database: " db
if [ ! -f "$db" ]
then
touch "$db"
echo "Database $db created."
fi
while true
do
echo "1. View database"
echo "2. View specific record"
echo "3. Add record"
echo "4. Delete record"
echo "5. Exit"
read -p "Enter your choice: " ch
case $ch in
1)
echo "Full database"
cat $db;;
2)
read -p "Enter id: " id
grep -i "^$id" "$db" || echo "no record found.";;
3)
read -p "Enter student id: " sid
read -p "Enter name: " nm
read -p "Enter designation: " des
read -p "Enter college name: " clg
echo "$sid $nm $des $clg" >> "$db"
echo "Record added";;
4)
read -p "Enter id: " id
grep -v "$id" $db > dbs1 && mv dbs1 "$db"
echo "Record deleted";;
5)
echo "Exiting..."
exit;;
*)
echo "Invalid choice!";;
esac
done
