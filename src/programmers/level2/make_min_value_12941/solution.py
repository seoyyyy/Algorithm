def solution(A,B):
    answer = 0
    A.sort()
    B.sort(reverse=True)

    for item in zip(A,B):
        answer += item[0]*item[1]

    return answer
A = [1, 4, 2]
B = [5, 4, 4]

result = solution(A,B)

print(result)