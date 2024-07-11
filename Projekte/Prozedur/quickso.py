def quickso(a):
    if (len(a)<2):
        return a + []
    else:
        p = a[0]
        al = []
        ar = []
        for i in range(1,len(a)):
            if (a[i]<p):
                al.append(a[i])
            else:
                ar.append(a[i])
        al = quickso(al)
        ar = quickso(ar)
        return al + [p] + ar
    
import time, random
count = 200770
for rounds in range(0, 10):
    print(str(count) + ": ")
    nums = [None] * count
    for i in range(count):
        nums[i] = random.randrange(10000)
    start = time.time()
    nums = quickso(nums)
    print(str(time.time() - start))
    count = 2 * count