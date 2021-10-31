def solution(skill, skill_trees):
    answer = 0
    for skill_tree in skill_trees:
        skill_list = list(skill)
        for s in skill_tree:
            if s in skill_list:
                if s != skill_list.pop(0):
                    break
        else:
            answer += 1

    return answer