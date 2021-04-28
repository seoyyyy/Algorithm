def solution(numbers):
    answer = []
    for i in range(len(numbers)):
        for j in range(i+1,len(numbers)):
            number = numbers[i]+numbers[j]
            if not number in answer:
                answer.append(number)
    return sorted(answer)