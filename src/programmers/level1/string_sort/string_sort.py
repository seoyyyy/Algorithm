def solution(strings, n):
    answer = strings
    for i in range(len(answer)-1):
        for j in range(i+1,len(answer)):
            if answer[i][n] < answer[j][n]:
                continue
            if answer[i][n] == answer[j][n] and answer[i]<answer[j]:
                continue

            t = answer[i]
            answer[i] = answer[j]
            answer[j] =  t
    return answer