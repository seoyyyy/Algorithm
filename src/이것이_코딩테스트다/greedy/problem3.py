import random


def my_solution():
    a, b = map(int, input().split())

    arr = []
    for i in range(a):
        arr.append([random.randint(1, 10000) for _ in range(b)])
    print(arr)
    m = 0
    for i in range(len(arr)):
        if m < min(arr[i]):
            m = min(arr[i])
    print(m)

def book_solution1():
    # N, M을 공백으로 구분하여 입력받기
    n, m = map(int, input().split())

    result = 0
    # 한 줄씩 입력받아 확인
    for i in range(n):
        data = list(map(int, input().split()))
        # 현재 줄에서 '가장 작은 수' 찾기
        min_value = min(data)
        # '가장 작은 수'들 중에서 가장 큰 수 찾기
        result = max(result, min_value)
    print(result)

def book_solution2():
    # N, M을 공백으로 구분하여 입력받기
    n, m = map(int, input().split())

    result = 0
    # 한 줄씩 입력받아 확인
    for i in range(n):
        data = list(map(int, input().split()))
        # 현재 줄에서 '가장 작은 수' 찾기
        min_value = 10001
        for a in data:
            min_value = min(min_value, a)
        # '가장 작은 수'들 중에서 가장 큰 수 찾기
        result = max(result, min_value)
    print(result)

if __name__ == '__main__':
    # my_solution()
    # book_solution1()
    book_solution2()