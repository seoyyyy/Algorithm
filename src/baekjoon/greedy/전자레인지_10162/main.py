arr = {'a': 0, 'b': 0, 'c': 0}

n = int(input())

if n % 10 != 0:
    print(-1)
else:

    while n:
        if n >= 300:
            n -= 300
            arr['a'] += 1
        elif n >= 60:
            n -= 60
            arr['b'] += 1
        elif n >= 10:
            n -= 10
            arr['c'] += 1

    for i in list(arr.values()):
        print(i, end=' ')
