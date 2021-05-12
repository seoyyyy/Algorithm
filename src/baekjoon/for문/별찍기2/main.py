import sys
# 아직 진행중
cnt = int(sys.stdin.readline())
for i in range(cnt,1,-1):
    print((" "* i) + "*" * (cnt-i+1),"\n")
