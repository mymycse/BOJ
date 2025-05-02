n = int(input())

res = ("G"*n + "..."*n + "\n")*n
res += ("."*n + "I"*n + "."*n + "T"*n + "\n")*n
res += (".."*n + "S"*n + "."*n + "\n")*n

print(res)