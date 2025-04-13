while True:
    line = input()
    if line.strip() == "0":
        break
    n = float(line)
    total = 1 + n + n**2 + n**3 + n**4
    print(f"{total:.2f}")