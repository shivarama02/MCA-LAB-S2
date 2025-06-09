#1/bin/bash
read -p "Enter directory ame you want to search: " dir
for file in "$(pwd)/$dir"
do
if [ -d "$file" ]
then
echo "$file is a directory"
else
echo "$file is not a directory"
fi
done
