arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))

if (not arr1[0] and not arr2[1]) or (not arr1[1] and not arr2[0]):
    print(0)
else:
    print(min(arr1[0]+arr2[1], arr1[1]+arr2[0]))