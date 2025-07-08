T = int(input())

for _ in range(T):
    G, C, E = map(int, input().split())
    need = max(0, E - C)
    if G == 1:
        km = need * 1
    elif G == 2:
        km = need * 3
    else:
        km = need * 5
    print(km)