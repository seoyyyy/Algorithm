def solution(priorities, location):
    cnt = 0
    arr = [i for i in range(len(priorities))]
    while priorities:
        if priorities:
            if priorities[0] < max(priorities):
                priorities.append(priorities.pop(0))
                arr.append(arr.pop(cnt))
            else:
                cnt +=1
                priorities.pop(0)

    return arr.index(location)+1

