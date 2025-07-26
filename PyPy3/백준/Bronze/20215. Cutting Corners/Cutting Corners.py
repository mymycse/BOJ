import math

w, h = map(int, input().split())
rectangle_cut = w + h
diagonal_cut = math.hypot(w, h)
difference = rectangle_cut - diagonal_cut
print(f"{difference:.10f}")