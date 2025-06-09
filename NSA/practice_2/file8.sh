#!/bin/bash
myfile="myfile"
if [ -f $myfile ]
then
echo "$myfile already exist!"
else
cat > "$myfile" << EOF
1001 RAM    97
1002 NEHA   89
1010 DIVYA  77
1025 RAHUL  65
1012 ARUN   99
1013 NISHA  76
EOF
echo "$myfile created succesfully"
cat myfile
fi
