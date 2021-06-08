arr = [int(input()) for _ in range(5)]

hbg = min(arr[:3])
drk = min(arr[3:])

result = hbg+drk-50

print(result)
