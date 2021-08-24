a = list(map(int,input().split()))
b = list(map(int, input().split()))

chicken = 0 if a[0] - b[0] > 0 else abs(a[0] - b[0])
beef = 0 if a[1] - b[1] > 0 else abs(a[1] - b[1])
pasta = 0 if a[2] - b[2] > 0 else abs(a[2] - b[2])
print(chicken + beef + pasta)