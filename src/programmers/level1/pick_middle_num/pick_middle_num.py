def solution(s):
    answer = ''
    middle = int(len(s)/2)
    if len(s) % 2 == 0:
        answer = s[middle-1:middle+1]
    else:
        answer = s[middle]
    return answer