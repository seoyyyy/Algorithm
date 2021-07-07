a = input()

if len(a) >= 3 and a[1] == '0':
    print(int(a[:2]) + int(a[2:]))
else:
    print(int(a[0]) + int(a[1:]))