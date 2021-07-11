# 0: 현재 고기의 온도 a
# 1: 목표 온도 b
# 2: 얼어있는 고기를 1도 데우는데 걸리는 시간 c
# 3: 얼어있는 고기를 해동하는데 걸리는 시간 d
# 4: 얼어있지 않은 고기를 1도 데우는데 걸리는 시간 e
arr = [int(input()) for _ in range(5)]
result = 0
if arr[0] < 0: # 고기가 얼어있을 때 데우고, 해동
    result = abs(arr[0]) * arr[2] + arr[3]
    arr[0] = 0

result += (arr[1] - arr[0]) * arr[4]

print(result)