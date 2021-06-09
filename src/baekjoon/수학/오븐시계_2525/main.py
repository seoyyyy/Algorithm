h, m = map(int, input().split())
n = int(input())

h += (m+n)//60
m = (m+n) % 60

if m >= 60:
    h += 1
    m -= 60

if h >= 24:
    h -= 24

print(h, m)