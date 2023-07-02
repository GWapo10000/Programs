(*Programmed by: April Dave R. Dezida && Carmela Belinda Alcain*)
(*Default pair*)
fun SORT_PAIR(pr1:int*int, pr2:int*int)=
if (#1 pr1 < #2 pr1 andalso #1 pr2 < #2 pr2) 
then((#1 pr1, #2 pr1),(#1 pr2, #2 pr2)) 
else((#1 pr1, #2 pr1),(#2 pr2, #1 pr2))
(*Condition one*)
fun SORT_PAIRCON1(pr1:int*int, pr2:int*int)=
if (#1 pr1 > #2 pr1 andalso #1 pr2 < #2 pr2) 
then((#1 pr1, #2 pr1),(#2 pr2, #1 pr2))
else((#2 pr1, #1 pr1),(#1 pr2, #2 pr2))
(*Condition two*)
fun SORT_PAIRCON2(pr1:int * int, pr2:int * int)=
if (#1 pr1 < #2 pr1 andalso #1 pr2 > #2 pr2) 
then((#2 pr1, #1 pr1),(#1 pr2, #1 pr2))
else((#1 pr1, #2 pr1),(#1 pr2, #2 pr2))
(*Condition three*)
fun SORT_PAIRCON3(pr1:int * int, pr2:int * int)=
if (#1 pr1 > #2 pr1 andalso #1 pr2 > #2 pr2) 
then((#2 pr1, #1 pr1),(#2 pr2, #1 pr2)) 
else((#1 pr1, #2 pr1),(#1 pr2, #2 pr2))        