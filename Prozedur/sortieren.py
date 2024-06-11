def vertausche(a, i, j):
    ai=a[i]
    a[i]=a[j]
    a[j]=ai
    
def sortieren(feld):
    for i in range(0,len(feld)):    
        minpos = i
        for k in range(i+1,len(feld)):
            if feld[k]<feld[minpos]:
                minpos = k
        if minpos > i:
            vertausche(feld,i,minpos)  
      
import time, random
count = 10000
for rounds in range(0, 10):
    print(str(count) + ": ")
    nums = [None] * count
    for i in range(count):
        nums[i] = random.randrange(10000)
    start = time.time()
    nums = sortieren(nums)
    print(str(time.time() - start))
    count = 2 * count