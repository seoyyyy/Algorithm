arr = []
for _ in range(9):
    arr.append(int(input()))
arr.sort()
for i in range(len(arr)-1):
    for j in range(i+1, len(arr)):
        a, b = arr[i], arr[j]
        if sum(arr) - a - b == 100:
            arr.remove(a)
            arr.remove(b)
            break
for i in arr:
    print(i)