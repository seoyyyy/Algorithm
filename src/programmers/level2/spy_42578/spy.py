clothes1 = [["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]
clothes2 = [["crowmask", "face"], ["bluesunglasses", "face"], ["smoky_makeup", "face"]]
def solution(clothes):
    d = {}
    for i in clothes:
        if d.get(i[1]):
            d[i[1]].append(i[0])
        else:
            d[i[1]] = [i[0]]

    answer = 1
    for i in d.keys():
        answer *= (len(d[i])+1)
    return answer

print(solution(clothes2)-1)