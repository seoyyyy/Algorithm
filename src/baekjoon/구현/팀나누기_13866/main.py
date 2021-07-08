arr = list(map(int, input().split()))
arr.sort()
print(abs((arr.pop(0) + arr.pop()) - (arr.pop(0) + arr.pop())))