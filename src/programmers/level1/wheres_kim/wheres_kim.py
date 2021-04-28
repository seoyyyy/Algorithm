def solution(seoul):
    answer = ''
    for idx in range(len(seoul)):
        if seoul[idx] == "Kim":
            answer = "김서방은 " + str(idx) + "에 있다"
    return answer