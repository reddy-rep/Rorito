if [ `wc -l lst.txt` -gt 0 ]

then

 

 

will test the line count of the file list.

 

So to get this to work you will need to create your list to an intermediate file name

 

test the intermediate file name number of lines - like command above

 

if it is > 0 then rename your intermediate file list to the real trigger named file list

 

 

something like

 

 

cd /$PMTargetFiles/RECEIVED

ls -lrt abc_* > howmanyfiles.txt

if [ `wc -l howmanyfiles.txt` -gt 0 ]

then

mv howmanyfiles.txt list.txt

else

echo "file not found "

fi


