def solution(numbers, hand):
    answer = ''

    keypad = [[1,4,7,10],[2,5,8,0],[3,6,9,11]]
    lp=[0,3]
    rp=[2,3]
    for n in numbers:
        for j in range(len(keypad)):
            for i in range(len(keypad[j])):
                if n == keypad[j][i]:
                    if j == 0:
                        answer += "L";
                    elif j == 2:
                        answer += "R";
                    else:
                        if abs(j-lp[0]) + abs(i-lp[1]) == abs(j-rp[0]) + abs(i-rp[1]):
                            answer += "R" if hand == "right" else "L"
                        elif abs(j-lp[0]) + abs(i-lp[1]) < abs(j-rp[0]) + abs(i-rp[1]):
                            answer += "L"
                        else:
                            answer += "R"

                    if answer[-1]=='L':
                        lp = [j,i]
                    else:
                        rp = [j,i]


                    break

    return answer