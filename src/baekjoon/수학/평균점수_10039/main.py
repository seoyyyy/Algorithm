arr = []
for _ in range(5):
    score = int(input())
    arr.append(score) if score > 40 else arr.append(40)


print(sum(arr)//len(arr))
