'''
5
5 10 10 15 20 # 5*(1/5) + 10*(2/5) + 15*(1/5) + 20*(1/5)
'''

n = int(input())
if n:
    l = list(map(int, input().split()))
    r = sorted(set(l)) # 중복값을 제거한 리스트
    avg = sum(l)/len(l) # 평균
    exp = 0
    #
    for i in r:
        exp += i * (l.count(i)/n)

    print('%.2f' % (avg / exp))
else:
    print("divide by zero")

