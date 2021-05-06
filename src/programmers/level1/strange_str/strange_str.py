def solution(s):
    answer = ''
    e = s.split(" ",-1)

    for idx,item in enumerate(e):
        for k in range(len(item)):
            if k % 2 :
                answer += item[k].lower()
            else:
                answer += item[k].upper()
        if(idx < len(e)-1): answer += " "


    return answer