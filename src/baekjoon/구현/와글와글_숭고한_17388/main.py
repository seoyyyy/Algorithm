p = list(map(int, input().split()))
s = ['Soongsil', 'Korea', 'Hanyang', 'OK']
if sum(p) < 100:
    print(s[p.index(min(p))])
else:
    print(s[3])