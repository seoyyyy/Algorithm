def solution(s):
    s = s.split(' ')
    l = [int(i) for i in s]

    return str(min(l)) + " " + str(max(l))