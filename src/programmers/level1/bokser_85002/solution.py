def solution(weights, head2head):
    answer = []

    for i in range(len(head2head)):
        w = 0
        for j in range(len(head2head[i])):
            if head2head[i][j] == 'W' and weights[i] < weights[j]:
                w += 1

        l = len(head2head[i]) - head2head[i].count('N')
        if l:
            rate = head2head[i].count('W') / l * 100
        else:
            rate = 0
        answer.append((rate, w, weights[i], i+1))

    answer.sort(key=lambda x: (-x[0], -x[1], -x[2], x[3]))

    return [i[3] for i in answer]