def solution(left, right):
    answer = 0
    for i in range(left,right+1):
        temp = 1
        for j in range(1,i//2+1):
            if not i%j:
                temp += 1
        answer += i if not temp % 2 else -i
    return answer