import math
def solution(dartResult):
    answer = [0,0,0]
    cnt = -1
    strNum = ""
    for i in dartResult:
        if 48 <= ord(i) and 57 >= ord(i):
            if not strNum:
                cnt += 1
            strNum += i
        else:
            if i == "S":
                answer[cnt] = int(strNum) ** 1
            elif i == "D":
                answer[cnt] = int(strNum) ** 2
            elif i == "T":
                answer[cnt] = int(strNum) ** 3
            elif i == "*":
                answer[cnt] *= 2
                if cnt >= 1:
                    answer[cnt-1] *=2
            elif i == "#":
                answer[cnt] *= -1
            strNum = ""

    return sum(answer)