mingook = sum(list(map(int, input().split())))
manse = sum(list(map(int, input().split())))

print(max(mingook, manse) if mingook != manse else mingook)
