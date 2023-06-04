import math
t = int(input())
result = 0
up = 1
down = 1


for i in range(t) :
    n, m = list(map(int, input().split()))
    result = math.factorial(m) // (math.factorial(n) * math.factorial(m - n))
    print(result)