arr = [int(input()) for _ in range(5)]
korean = arr[1]//arr[3] + (1 if arr[1] % arr[3] else 0)
math = arr[2]//arr[4] + (1 if arr[2] % arr[4] else 0)
print(arr[0] - max(korean, math))