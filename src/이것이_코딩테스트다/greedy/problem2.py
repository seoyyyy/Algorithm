def my_solution(n, m, k, arr):
    answer = 0
    arr.sort(reverse=True)
    cnt = 0
    for _ in range(m):
        cnt += 1
        if cnt > k:
            cnt = 0
            answer += arr[1]
        else:
            answer += arr[0]
    print(answer)

def book_solution(n, m, k, data):
    data.sort()
    first = data[n-1]
    second = data[n-2]
    result = 0
    while True:
        for _ in range(k):
            if m == 0:
                break
            result += first
            m -= 1
        if m == 0:
            break
        result += second
        m -= 1
    print(result)

def book_solution2(n, m, k, data):
    data.sort() #  입력 받은 수 정렬
    first = data[n-1] # 가장 큰 수 
    second = data[n-2] # 두번째로 큰 수
    
    # 가장 큰 수가 더해지는 횟수 계산
    count = m//(k+1) * k 
    count += m % (k + 1)

    result = 0
    result += count * first # 가장 큰 수 더하기
    result += (m-count) * second # 두번째로 큰 수 더하기
    print(result)

if __name__ == '__main__':
    n, m, k = map(int, input().split())
    arr = list(map(int, input().split()))
    my_solution(n, m, k, arr)
    book_solution(n, m, k, arr)
    book_solution2(n, m, k, arr)