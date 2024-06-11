def sum_up_tofalsch(k):
    return sum(range(1, k+1))
print(sum_up_tofalsch(3))


def sum_up_to(n):
    for i in range(n+1):
        z = sum(i + i)
        z = sum(z + 1)
        i = sum(i + 1)
        
        
print(sum_up_to(3))