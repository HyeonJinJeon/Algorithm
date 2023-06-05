n = int(input())

result = 0

while n>=0 :
    if n % 5 == 0 :
        result = result + n//5
        break
    n = n - 3
    result = result + 1
    if n < 0 :
        result = -1
print(result)