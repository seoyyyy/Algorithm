scores = [int(input()) for _ in range(6)]

apple = scores[0] * 3 + scores[1] * 2 + scores[2] * 1
banana = scores[3] * 3 + scores[4] * 2 + scores[5] * 1

if apple == banana:
    print("T")
elif banana > apple:
    print("B")
else:
    print("A")