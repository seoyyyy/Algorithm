# def solution(s):
#     st = []
#     for i in range(len(s)):
#         if s[i] == '(':
#             st.append(i)
#         elif s[i] == ')':
#             if len(st) == 0:
#                 return False
#             st.pop()
#     if not len(st) == 0:
#         return False
#     return True


def solution(s):
    answer = True

    while s:
        if '()' in s :
            s = s.replace('()','')
        else:
            answer = False
            break

    return answer