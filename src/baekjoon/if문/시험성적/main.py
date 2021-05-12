s = int(input())
if not( s < 0 or s > 100):
    if s//10 == 10 or s//10 == 9:
        print("A")
    elif s//10 == 8:
        print("B")
    elif s//10 == 7:
        print("C")
    elif s//10 == 6:
        print("D")
    else:
        print("F")
