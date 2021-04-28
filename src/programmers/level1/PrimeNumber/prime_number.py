def solution(nums):
    answer = 0
    for i in range(0,len(nums)-2):
        for j in range(i+1,len(nums)-1):
            for k in range(j+1,len(nums)):
                total_num = nums[i] + nums[j] + nums[k]
                if(isPrime(total_num)):
                    answer+=1
    return answer


def isPrime(num):
    flag = True
    for z in range(2,num):
        if(num % z == 0):
            flag = False
            break
    return flag