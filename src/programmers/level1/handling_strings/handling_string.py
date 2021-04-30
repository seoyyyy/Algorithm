import re
def solution(s):
    a = False
    if (len(s) == 4 or len(s) ==6) and re.match("^\\d+$",s):
        a = True
    return a