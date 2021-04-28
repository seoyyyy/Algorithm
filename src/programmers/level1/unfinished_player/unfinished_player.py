def solution(participant, completion):
    answer = ''

    players = {}

    for player in participant:
        if not player in players:
            players[player] = 1
        else:
            players[player] = players[player] + 1

    for player in completion:
        if player in players:
            players[player] = players[player] -1

    for player in players:
        if players[player]:
            answer = player


    return answer