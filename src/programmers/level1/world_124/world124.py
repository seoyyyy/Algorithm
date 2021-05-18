def solution(n):
    answer = ''
    numbers = ["4","1","2"]
    while n > 0:
        remain = int(n % 3)
        n //= 3
        if remain == 0: n -=1
        answer = numbers[remain] + answer
    return answer