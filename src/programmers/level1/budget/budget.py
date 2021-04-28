def solution(d, budget):
    answer = 0
    d.sort();

    for item in d:
        if budget - item < 0 : break
        budget -= item
        answer += 1
    return answer