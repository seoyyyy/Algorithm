def solution(n):
    answer = 1
    while True:
        if n % answer == 1:
            break
        answer += 1
    return answer