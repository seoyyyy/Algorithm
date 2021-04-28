import datetime
def solution(a, b):
    # 1.
    day = ["MON","TUE","WED","THU","FRI","SAT","SUN"]
    # 2.
    selectedDate = datetime.datetime(2016,a,b).weekday()
    # 3.
    answer = day[selectedDate]
    return answer