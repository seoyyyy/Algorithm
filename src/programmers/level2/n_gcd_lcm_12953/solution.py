def solution(arr):
    answer = arr[0]
    for i in range(1, len(arr)):
        answer = answer * arr[i] / gcd(answer, arr[i])

    return int(answer)

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

test_arr = [2,6,8,14]
test_arr2 = [1,2,3]

result = solution(test_arr2)

print(result)
