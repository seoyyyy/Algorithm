D, H, M = map(int, input().split())
start = 11 * 24 * 60 + 11 * 60 + 11
end = D * 24 * 60 + H * 60 + M

res = end - start
if res < 0:
    print(-1)
else:
    print(res)