t=int(input())
l1=[]
for i in range(t):
    l=int(input())
    l1.append(l)
l1.sort()
for i in range(t):
    l1[i]=l1[i]*(len(l1)-i)
print(max(l1))