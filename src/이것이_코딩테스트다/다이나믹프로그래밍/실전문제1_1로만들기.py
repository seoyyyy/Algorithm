x = 26
cnt = 0
while x > 1:
    if not x % 5:
        x /= 5
        cnt += 1

    elif not x % 3:
        x /= 3
        cnt += 1

    elif not x % 2:
        x /= 2
        cnt += 1

    else:
        x -= 1
        cnt += 1
print(cnt)