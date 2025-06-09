#!/bi/bash
if [[ $# -eq 3 ]]
then
	if [[ $1 =~ ^[1-9]+$ ]]
	then
		if [[ $1 -gt $2 ]] && [[ $1 -gt $3 ]]
		then
			echo "$1 is the largest number"
		elif [[ $2 -gt $3 ]]
		then
			echo "$2 is the largest number"
		else 
			echo "$3 is largest number"
		fi
	else
		echo "Enter valid arguments : string not supporrted"
	fi
else
	echo "Enter valid argumnets"
	fi
