arr = ["Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"]
def solution(record):
    people = {}
    result = []
    for msg in record:
        tmp = msg.split()
        if tmp[0] != 'Leave':
            people[tmp[1]] = tmp[2]

    for msg in record:
        tmp = msg.split()
        if tmp[0] == 'Enter':
            result.append(people[tmp[1]]+"님이 들어왔습니다.")
        elif tmp[0] == 'Leave':
            result.append(people[tmp[1]]+"님이 나갔습니다.")
    return result

print(solution(arr))