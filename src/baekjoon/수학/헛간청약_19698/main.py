'''
## 원래 나의 풀이
N, W, H, L = map(int, input().split())

barn = W * H
cow = L * L

while barn - (cow * N) < 0:
    N -= 1

print(N)

'''

N, W, H, L = map(int, input().split())

a = W // L
b = H // L
res = a * b
if N < res:
    print(N)
else:
    print(res)