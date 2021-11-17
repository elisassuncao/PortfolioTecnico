#!bin/bash

echo "qual número você quer:"
read t

while [ $t -ge 0 ]
do

i=$(($t%2))
if [ $i -eq 0 ]
then
echo "$t"
fi
t=$(($t-1))
done
