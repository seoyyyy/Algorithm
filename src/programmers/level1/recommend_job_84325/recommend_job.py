def solution(table, languages, preference):
    jobs = {}
    for job in table:
        l = job.split(' ')
        sum = 0
        for i in range(len(languages)):
            if languages[i] in l:
                sum += (len(l) - l.index(languages[i])) * preference[i]
        # 점수 총합을 담을 dict
        jobs[l[0]] = sum

    m = max(jobs.values())
    s = []
    for key, value in jobs.items():
        if m == value:
            s.append(key)
    s.sort()

    answer = s[0]
    return answer