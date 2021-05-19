def my_solution():
    loc = input()
    cnt = 0
    x = [1, 2, 3, 4, 5, 6, 7, 8]
    y = [chr(i) for i in range(ord('a'), ord('a') + 8)]

    mapx = ord(loc[0])
    mapy = loc[1]
    if chr(mapx - 2) in y and int(mapy) + 1 in x:
        cnt += 1
    if chr(mapx - 2) in y and int(mapy) - 1 in x:
        cnt += 1
    if chr(mapx + 2) in y and int(mapy) + 1 in x:
        cnt += 1
    if chr(mapx + 2) in y and int(mapy) - 1 in x:
        cnt += 1
    if chr(mapx - 1) in y and int(mapy) + 2 in x:
        cnt += 1
    if chr(mapx - 1) in y and int(mapy) - 2 in x:
        cnt += 1
    if chr(mapx + 1) in y and int(mapy) + 2 in x:
        cnt += 1
    if chr(mapx + 1) in y and int(mapy) - 2 in x:
        cnt += 1
    print(cnt)


def book_solution():
    # 현재 나이트의 위치 입력받기
    input_data = input()
    row = int(input_data[1])
    column = int(ord(input_data[0])) - int(ord('a')) + 1

    # 나이트가 이동할 수 있는 8가지 방향 정의
    steps = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]

    # 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
    result = 0
    for step in steps:
        # 이동하고자 하는 위치 확인
        next_row = row + step[0]
        next_column = column + step[1]
        # 해당 위치로 이동이 가능하다면 카운트 증가
        if 1 <= next_row <= 8 and 1 <= next_column <= 8:
            result += 1
    print(result)


if __name__ == '__main__':
    book_solution()
