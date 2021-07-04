phone_book = ["123", "456", "789"]
def solution(phone_book):
    phone_book.sort()
    for i in range(0, len(phone_book)-1):
        if phone_book[i+1].find(phone_book[i]) == 0:
            return False
    return True

print(solution(phone_book))
