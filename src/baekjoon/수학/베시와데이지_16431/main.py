b_x, b_y = map(int, input().split()) # 배시 위치
d_x, d_y = map(int, input().split()) # 데이지 위치
j_x, j_y = map(int, input().split()) # 존 위치

r_b_x, r_b_y = abs(j_x - b_x), abs(j_y - b_y)
r_d_x, r_d_y = abs(j_x - d_x), abs(j_y - d_y)

B = max(r_b_x, r_b_y)
D = r_d_x + r_d_y

if B == D:
    print("tie")
elif B < D:
    print("bessie")
else:
    print("daisy")