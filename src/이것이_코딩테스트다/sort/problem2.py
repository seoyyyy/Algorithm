def my_solution():
    n = int(input())

    array = []

    for _ in range(n):
        info = input().split()
        array.append((info[0], int(info[1])))

    array = sorted(array, key=lambda x: x[1])

    for i in array:
        print(i, end=' ')

def book_solution():
    # N을 입력받기
    n = int(input())

    # N 명의 학생 정보를 입력받아 리스트에 저장
    array = []
    for i in range(n):
        input_data = input().split()
        # 이름은 문자열 그대로, 점수는 정수형으로 변환하여 저장
        array.append((input_data[0], int(input_data[1])))

    # 키(key)를 이용하여, 정수를 기준으로 정렬
    array = sorted(array, key= lambda student:student[1])

    # 정렬이 수행된 결과를 출력
    for student in array:
        print(student[0], end=' ')