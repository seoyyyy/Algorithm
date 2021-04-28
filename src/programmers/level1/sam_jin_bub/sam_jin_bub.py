def solution(n):
    answer = 0
    box = []
    while n > 0:
        box.append(n % 3)
        n = int(n/3)

    for idx in range(len(box)):
        answer += box[idx] * (3 ** (len(box)-idx-1))

    return answer