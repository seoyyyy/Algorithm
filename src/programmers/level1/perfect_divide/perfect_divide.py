def solution(arr, divisor):
    answer = []
    for item in arr:
        if item % divisor == 0:
            answer.append(item)

    if not len(answer): answer.append(-1)

    return sorted(answer)