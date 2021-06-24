for _ in range(3):
    arr = list(map(int, input().split()))
    if arr[5] >= arr[2]:
        arr[5] -= arr[2]
    else:
        arr[5] = arr[5] - arr[2] + 60
        arr[4] -= 1

    if arr[4] >= arr[1]:
        arr[4] -= arr[1]
    else:
        arr[4] = arr[4] - arr[1] + 60
        arr[3] -= 1

    if arr[3] >= arr[0]:
        arr[3] -= arr[0]
    else:
        arr[3] = arr[3] - arr[0] + 24

    print(arr[3], arr[4], arr[5])


