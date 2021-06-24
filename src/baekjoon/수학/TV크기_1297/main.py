import math

a, b, c = map(int, input().split())
k = math.sqrt(math.pow(a, 2) / (math.pow(b, 2) + math.pow(c, 2)))
print(math.floor(k*b), math.floor(k*c))
