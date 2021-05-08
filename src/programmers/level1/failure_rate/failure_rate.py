def solution(N, stages):
    answer = {}
    user = []

    for i in range(1,N+1):
        user.append(stages.count(i))
        d = (len(stages) - sum(user[:i-1]))
        answer[i] = float(stages.count(i))/ d if d else 0

    return sorted(answer,key=lambda x:answer[x] ,reverse=True)