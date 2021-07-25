b_year, b_month, b_day = map(int, input().split()) # 0 : year, 1: month, 2: day
s_year, s_month, s_day = list(map(int, input().split()))

man_age = s_year - b_year
count_age = s_year - b_year + 1
year_age = s_year - b_year
if b_month > s_month or (b_month == s_month and b_day > s_day):
    man_age -= 1

print(man_age)
print(count_age)
print(year_age)
