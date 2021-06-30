n = int(input())
answer = 2
a = 2
for i in range(1, n+1):
    if i < n:
        answer += a
    if not i % 2:
        a += 1

print(answer)