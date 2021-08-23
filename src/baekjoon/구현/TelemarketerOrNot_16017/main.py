digits = [int(input()) for _ in range(4)]

if digits[0] in [8, 9] and digits[3] in [8, 9] and digits[1] == digits[2]:
    print("ignore")
else:
    print("answer")
