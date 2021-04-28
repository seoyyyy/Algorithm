def solution(n, lost, reserve):
    answer = n - len(lost)

    lost = sorted(lost)
    reserve = sorted(reserve)

    for i in range(len(lost)):
        for j in range(len(reserve)):
            if lost[i] == reserve[j]:
                answer += 1
                lost[i]=-1
                del reserve[j]
                break

    for i in range(len(lost)):
        for j in range(len(reserve)):
            if reserve[j]+1 == lost[i] or reserve[j]-1 == lost[i]:
                answer += 1
                del reserve[j]
                break

    return answer