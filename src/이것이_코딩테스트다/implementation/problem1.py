def my_solution():
    n = int(input())
    destination = map(str, input().split())

    direction = {"L": [0, -1], "R": [0, 1], "U": [-1, 0], "D": [1, 0]}
    cur_loc = [1, 1]

    for i in destination:
        cur_loc = [x + y if (x+y < n and x+y > 0) else x for x, y in zip(cur_loc, direction[i])]

    print(cur_loc)

def book_solution():
    # N을 입력받기
    n = int(input())
    x, y = 1, 1
    plans = input().split()

    # L, R, U, D에 따른 이동 방향
    dx = [0, 0, -1, 1]
    dy = [-1, 1, 0, 0]
    move_types = ['L', 'R', 'U', 'D']

    # 이동 계획을 하나씩 확인
    for plan in plans:
        # 이동 후 좌표 구하기
        for i in range(len(move_types)):
            if plan == move_types[i]:
                nx = x + dx[i]
                ny = y + dy[i]
        #공간을 벗어나는 경우 무시
        if nx < 1 or ny < 1 or nx > n or ny > n:
            continue
        x, y = nx, ny
    print(x, y)

if __name__ == '__main__':
    book_solution()