(*fun swap(pr:int*string)=
    (#2 pr, #1 pr)*)

(*fun sum_two_pairs(pr1:int*int,pr2:int*int)=
    (#1 pr1) + (#2 pr1) + (#1 pr2) + (#2 pr2)

fun div_mod(x:int,y:int)=
    (x div y, x mod y)*)

fun swap(pr:int*string*bool*int)=
    (#3 pr, #1 pr, #4 pr, #2 pr)

fun sum_list(xs:bool list)= (*[5,4,5,7,~3,5]*)
    if null xs        
    then 0
    else hd xs + sum_list(tl(xs))

fun sum_pair_list(xs:(int*int)list)=
    if null xs
    then 0
    else #1 (hd xs) + #2 (hd xs)








