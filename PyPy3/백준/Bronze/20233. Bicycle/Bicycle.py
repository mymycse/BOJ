a = int(input())
x = int(input())
b = int(input())
y = int(input())
T = int(input())

over1 = max(0, T - 30)
total1 = a + over1 * x * 21

over2 = max(0, T - 45)
total2 = b + over2 * y * 21

print(f"{total1} {total2}")