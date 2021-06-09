arr = list(map(int, input().split()))
s = {i: arr.count(i) for i in arr}
value = 1
for i in s:
    value = s.get(i)
    if value == 3:
        print(10000 + i * 1000)
        break

    elif value == 2:
        print(1000 + i * 100)
        break

if value == 1:
    print(max(s.keys())*100)