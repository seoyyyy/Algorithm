def solution(nums):
    canSelect = len(nums)/2
    data = set()
    for item in nums:
        if len(data) < canSelect and not item in data:
            data.add(item)

    return len(data)