import math as m
import time as t
num = int(input())
flag=False
start=t.perf_counter()
if num % 2 == 0 or num % 3 == 0:
    flag =true
else:
    cf = 5
    while cf <= m.sqrt(num):
        if num % cf == 0:
            flag = True
            break
        cf+=2
        if num % cf == 0:
            flag = True
            break
        cf+=4
stop = t.perf_counter()
if flag == False:
    print("PRIME")
    print((stop-start))
