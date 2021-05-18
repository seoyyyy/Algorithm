import time


def solution(n):
    start_time = time.time()
    cnt = 0
    coin_type = [500, 100, 50, 10]
    for coin in coin_type:
        cnt += n // coin # 해당 화폐로 거슬러줄 수 있는 동전의 개수 세기
        n %= coin
    end_time = time.time()
    print(cnt)
    print("time = ", end_time-start_time)


if __name__ == '__main__':
    solution(1260)
