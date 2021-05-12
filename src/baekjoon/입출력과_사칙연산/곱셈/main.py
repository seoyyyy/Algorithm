a = int(input())
b = input()
result = 0
for i in range(len(b),0,-1):
    temp = a * int(b[i-1])
    print(temp)

print(a*int(b))
