h, m, s = map(int, input().split())

s += int(input())

if s >= 60:
    m += s // 60
    s %= 60

if m >= 60:
    h += m // 60
    m %= 60

if h >= 24:
    h %= 24

print(h, m, s)
