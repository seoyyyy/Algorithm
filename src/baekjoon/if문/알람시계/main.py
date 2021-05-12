h,m = map(int,input().split())

if m-45 < 0:
    h = h-1 if h else 23
    m += 15
else:
    m-=45

print(h,m)