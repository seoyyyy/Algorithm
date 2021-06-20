import sys

def binary_search(arr, target, start, end):
    if start > end:
        return
    mid = (start + end) // 2
    if arr[mid] == target:
        return mid
    elif arr[mid] > target:
        return binary_search(arr, target, start, mid - 1)
    else:
        return binary_search(arr, target, mid + 1, end)

n = int(sys.stdin.readline().rstrip())
part = list(map(int, sys.stdin.readline().rstrip().split()))

m = int(sys.stdin.readline().rstrip())
order = list(map(int, sys.stdin.readline().rstrip().split()))

for i in order:
    print(binary_search(part, i, 0, n-1))