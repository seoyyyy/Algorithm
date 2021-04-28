def solution(lottos, win_nums):
    cnt = len(set(lottos) & set(win_nums))
    zero = lottos.count(0)

    return [7-max(cnt+zero,1) ,7-max(cnt,1)]