import time


def my_solution():
    n = int(input())
    cnt = 0
    for i in range(0, n+1):
        for j in range(0, 60):
            for k in range(0, 60):
                clock = str(i) + str(j) + str(k)
                if clock.find("3") > -1:
                    cnt += 1
    print(cnt)


def book_solution():
    h = int(input())

    count = 0
    for i in range(h+1):
        for j in range(60):
            for k in range(60):
                if '3' in str(i)+str(j)+str(k):
                    count += 1
    print(count)
if __name__ == '__main__':
    my_solution()