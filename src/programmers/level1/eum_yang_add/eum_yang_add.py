def solution(absolutes, signs):
    answer = 0

    for idx in range(len(absolutes)):
        answer += absolutes[idx] if signs[idx] else -absolutes[idx]

    return answer