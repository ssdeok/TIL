gems = [3, 3, 1, 2, 3, 2, 2, 3, 3 ,1]

grades = {1:0, 2:0, 3:0}
for gem in gems:
    grades[gem] += 1

print(grades)
