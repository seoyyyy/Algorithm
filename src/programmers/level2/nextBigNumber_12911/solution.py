def solution(n):
    answer = 0
    b = bin(n)
    for i in range(n+1, 1000000):
        if bin(i).count('1') == b.count('1'):
            answer = i
            break


    return answer