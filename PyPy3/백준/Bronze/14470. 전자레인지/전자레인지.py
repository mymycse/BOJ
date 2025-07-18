A = int(input())
B = int(input())
C = int(input())
D = int(input())
E = int(input())

time = 0

if A < 0:
    time += abs(A) * C  # 음수 구간
    time += D           # 해동 시간
    time += B * E       # 0 이상 구간
else:
    time += (B - A) * E

print(time)
