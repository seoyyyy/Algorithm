n = int(input())
score = list(map(float, input().split()))

max = max(score)

new_score = [i/max*100 for i in score]
print(sum(new_score)/len(new_score))