def solution(answers):
    answer = []

    marks = [[1, 2, 3, 4, 5],
             [2,1,2,3,2,4,2,5],
             [3,3,1,1,2,2,4,4,5,5]]

    scores = {1:0,2:0,3:0}
    for index,mark in enumerate(marks):
        idx = 0
        for num in answers:
            if num == mark[idx]:
                scores[index+1] += 1
            idx = idx + 1 if idx<len(mark)-1 else 0

    for key in scores:
        if scores[key] == max(scores.values()):
            answer.append(key)

    return answer