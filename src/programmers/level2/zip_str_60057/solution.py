# 문자열 압축
def solution(s):
    mid = len(s) // 2
    answer = len(s)
    length = 1
    while length <= mid:
        l = [s[i: i+length] for i in range(0, len(s), length)]

        tmplist = []
        while l:
            chkStr = l.pop(0)
            if tmplist and tmplist[-1][1] == chkStr:
                tmplist[-1][0] += 1
            else:
                tmplist.append([1,chkStr])

        tmpAnswer = ''
        for i in range(len(tmplist)):
            if tmplist[i][0] > 1:
                tmpAnswer += str(tmplist[i][0]) + tmplist[i][1]
            else:
                tmpAnswer += tmplist[i][1]
        if answer > len(tmpAnswer):
            answer = len(tmpAnswer)
        length += 1
    return answer