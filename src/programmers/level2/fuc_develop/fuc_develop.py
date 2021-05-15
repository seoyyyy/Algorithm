def solution(progresses, speeds):
    answer = []
    val = 0
    for i in range(len(progresses)):
        remain = (100 - progresses[i])//speeds[i] + (1 if (100 - progresses[i]) % speeds[i] else 0)
        if answer and val >= remain:
            answer[-1] += 1
        else:
            answer.append(1)
            val = remain
    return answer