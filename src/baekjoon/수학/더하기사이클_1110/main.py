n = input().zfill(2)
cnt = 0
origin = n
while True:
    s = str(int(n[0])+int(n[1]))
    n = n[1] + s[len(s)-1]
    cnt += 1
    if origin == n:
        break
print(cnt)