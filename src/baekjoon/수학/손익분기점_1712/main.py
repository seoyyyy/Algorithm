a, b, c = map(int, input().split())

cost = a//(c-b)+1 if b < c else -1

print(cost)


##### 나중에 다시 확인