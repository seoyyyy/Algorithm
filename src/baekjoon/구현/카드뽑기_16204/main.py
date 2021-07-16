n, m, k = map(int, input().split())

oo = min(m, k)
xx = n - max(m, k)

print(oo + xx)