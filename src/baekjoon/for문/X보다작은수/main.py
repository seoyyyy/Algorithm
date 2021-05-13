import sys
cnt,num = map(int, sys.stdin.readline().split())

temp = list(map(int,sys.stdin.readline().split()))

print (''.join([str(temp[i])+" " if temp[i]<num else "" for i in range(cnt)]))
