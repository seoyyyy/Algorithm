n, m = map(int, input().split())

if m <= n:
    if m <= 2:
        print("NEWBIE!")
    else:
        print("OLDBIE!")
else:
    print("TLE!")