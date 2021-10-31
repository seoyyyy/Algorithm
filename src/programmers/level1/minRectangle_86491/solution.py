def solution(sizes):
    w = []
    h = []

    for i in sizes:
        w.append(max(i))
        h.append(min(i))

    answer = max(w) * max(h)

    return answer