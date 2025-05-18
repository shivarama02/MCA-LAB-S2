#!/bin/bash
read -p "Enter directory name you want to search: " dir
direct="/mnt/d/MCA_PG_CET/LAB_PROGRAMS_S2/MCA-LAB-S2/NSA/$dir"
if [ -d "$direct" ]
then
num_files=$(find $direct -type f | wc -l)
echo "There are $num_files files in $direct"
else
echo "$direct is not a directory"
fi
