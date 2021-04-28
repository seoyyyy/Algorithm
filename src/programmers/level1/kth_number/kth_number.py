def solution(array, commands):
    answer = []
    for command in commands:
        box = array[command[0]-1:command[1]]
        box = sorted(box)
        answer.append(box[(command[2]-1)])

    return answer