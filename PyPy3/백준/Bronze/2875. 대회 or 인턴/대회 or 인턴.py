N, M, K = map(int, input().split())

team = min(N // 2, M)

while (N + M - team * 3) < K:
    team -= 1

print(team)
