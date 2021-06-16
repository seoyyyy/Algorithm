arr = [int(input()) for _ in range(5)]

x = arr[0] * arr[4]
y = arr[1] + ((arr[4] - arr[2]) * arr[3] if arr[4] > arr[2] else 0)

print(min(x, y))