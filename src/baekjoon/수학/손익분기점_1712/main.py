# 아직 틀린상태..
a, b, c = map(int, input().split())

cost = -a
cnt = 0
while cost < 0:
    if c <= b:
        cnt = -1
        break
    cost += -b + c
    cnt += 1
print(cnt)