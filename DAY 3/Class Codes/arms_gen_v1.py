import math as m
import time as t
n = int(input())
start = t.perf_counter()
for num in range(1,n+1):
    nod_num = m.ceil(m.log10(num))
    tot=0
    copy_num = num
    while copy_num != 0:
        digit = copy_num % 10
        powered_digit = digit**nod_num
        tot+=powered_digit
        copy_num//=10
    if tot == num:
        print(num, end=' ')
stop = t.perf_counter()
print()
duration = ( stop - start )
print(duration)
