def fibonacci(k):
    if k <= 0:
        return 0
    elif k == 1:
        return 1
    else:
        return fibonacci(k-1) + fibonacci(k-2)

k = int(input("Welche Fibonacci-Zahl soll berechnet werden: "))
result = fibonacci(k)
print("Die", k, "-te Fibonacci-Zahl ist:", result)