(*Programmed by :April Dave R. Dezida and Carmela Belinda Alcain*)
(*BSCS 3A*)
fun you_and_me(pr1:int*int*int, pr2:int*int*int)=
    if((#1 pr1) + (#2 pr1) + (#3 pr1))<((#1 pr2)+(#2 pr2)+(#3 pr2))
    then true
    else false
