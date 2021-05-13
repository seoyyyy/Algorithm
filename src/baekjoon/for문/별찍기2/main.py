import sys
# 아직 진행중
cnt = int(sys.stdin.readline())
for i in range(cnt):
    print(" "* (cnt-(i+1)) + "*" * (i+1))


