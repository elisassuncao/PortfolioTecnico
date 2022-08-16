#!/bin/bash

echo "qual tabuada você quer:"
read t

for i in $(seq 1 10)

do

res=$(($t*$i))
echo "$t * $i = $res"
done

#Conteúdo que eu aprendi bem rápido#
