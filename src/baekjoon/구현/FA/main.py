def f(x):
    global r
    x = str(x)
    x = int(x[0]) * len(x)
    if r == x:
        print("FA")
        return

    r = x
    f(x)

n = input()
r = n
n = int(n[0]) * len(n)
f(n)