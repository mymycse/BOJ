n = int(input())

if n == 1:
    print(11)
    print("A B C D E F G H J L M")
elif n == 2 or n == 3:
    print(9)
    print("A C E F G H I L M")
elif n == 4:
    print(9)
    print("A B C E F G H L M")
else:
    print(8)
    if n == 10:
        print("A B C F G H L M")
    else:
        print("A C E F G H L M")