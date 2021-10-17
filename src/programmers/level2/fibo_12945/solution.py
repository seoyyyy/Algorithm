def solution(n):
    f = []
    for i in range(n):
        if i < 2:
            f.append(i)
        else:
            f.append(f[i-1]+f[i-2])

    return sum(f[len(f)-2:]) % 1234567

test1 = 2
test2 = 5
a = solution(test2)

print(a)