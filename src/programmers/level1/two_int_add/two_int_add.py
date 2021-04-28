def solution(a, b):
    answer = 0

    n1 = a if a < b else b
    n2 = a if a > b else b

    for i in range(n1, n2+1):
        answer += i

    return answer