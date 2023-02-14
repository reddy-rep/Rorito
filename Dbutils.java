I have developed a workflow like this..           

                                                         

workflow ---->command_task---------->event_wait-->session1

 

 

I have written a shell script like below.

 

 

cd /$PMTargetFiles/RECEIVED

ls -l ack_*| awk 'NR >0 && !/^d/ {print $NF}' >>list.txt

chmod 664 list.txt
