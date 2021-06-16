triangle = [int(input()) for _ in range(3)]
if sum(triangle) == 180:
    if triangle.count(60) == 3:
        print("Equilateral")
    elif triangle.count(triangle[0]) == 2 or triangle.count(triangle[1]) == 2:
        print("Isosceles")
    else:
        print("Scalene")
else:
    print("Error")