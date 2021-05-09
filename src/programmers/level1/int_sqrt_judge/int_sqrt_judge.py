def solution(n):
    s = str(n ** (1/2)).split(".")
    return -1 if s[1] != "0" else (int(s[0])+1) ** 2