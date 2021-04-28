import re
def solution(new_id):
    answer = new_id

    # 1단계
    answer = answer.lower()

    # 2단계
    answer = re.sub("[^a-z\d\.\-\_]",'',answer)

    # 3단계
    answer = re.sub("[.]{2,}",".",answer)

    # 4단계
    answer = re.sub("^[.]|[.]$","",answer)

    # 5단계
    answer = re.sub("^$","a",answer)

    # 6단계
    answer = re.sub("^.{16,}$",answer[0:15],answer)

    answer = re.sub("[.]$","",answer)

    # 7단계
    if len(answer)<3:
        while len(answer) <3:
            answer += answer[len(answer)-1]
    return answer