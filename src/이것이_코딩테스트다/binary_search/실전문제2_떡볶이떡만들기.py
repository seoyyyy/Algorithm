import sys


def solution(arr, target, start, end):
    if start > end:
        return
    mid = (start + end) // 2
    result = 0
    for i in arr:
        result += i - mid if i > mid else 0

    if result == target:
        return mid
    elif result > target:
        return solution(arr, target, mid + 1, end)
    else:
        return solution(arr, target, start, mid - 1)

n, m = map(int, sys.stdin.readline().rstrip().split())
arr = list(map(int, sys.stdin.readline().rstrip().split()))

result = solution(arr, m, m, max(arr))

print(result)
