def solution(board, moves):
    box = []
    answer = 0
    for move in moves:
        for index in range(len(board)):
            item = board[index][move-1]
            if item:
                if (len(box) == 0)  or (box[len(box)-1] != item):
                    box.append(item)
                else:
                    box.pop(len(box)-1)
                    answer = answer + 2

                board[index][move-1] = 0

                break
    return answer