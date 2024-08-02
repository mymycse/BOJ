from math import pi

a, p1 = map(int, input().split())
r, p2 = map(int, input().split())

if p1 / a < p2 / (r ** 2 * pi):
    print("Slice of pizza")
else:
    print("Whole pizza")