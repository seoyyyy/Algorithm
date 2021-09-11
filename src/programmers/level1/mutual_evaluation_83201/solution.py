def solution(scores):
    answer = ''
    for i in range(len(scores)):
        score = []
        for j in range(len(scores)):
            score.append(scores[j][i])

        if (score[i] == max(score) or score[i] == min(score) )and score.count(score[i]) == 1:
            del score[i]
        avg = sum(score) / len(score)

        if avg >= 90:
            answer += "A"
        elif avg >= 80:
            answer += "B"
        elif avg >= 70:
            answer += "C"
        elif avg >= 50:
            answer += "D"
        else:
            answer += "F"

    return answer