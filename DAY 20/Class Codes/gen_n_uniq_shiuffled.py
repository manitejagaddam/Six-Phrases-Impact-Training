import random as r
n = int(input())
nums=[]
for iter in range( 1, n+1):
    nums.append(iter)
print(nums)    
    
r.shuffle( nums )

fil = open("data_uniq_1000.txt", 'w')
for val in nums:
    fil.write(str(val) + " ")
    
fil.close()
