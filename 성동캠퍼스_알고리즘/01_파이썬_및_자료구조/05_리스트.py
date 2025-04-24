# 리스트
# 1. append
numbers = [1, 2, 3]
numbers.append(4)

print(numbers)

# 2. pop
numbers = [1, 2, 3]
number = numbers.pop()
print(numbers)
print(number)

numbers = [1, 2, 3]
number = numbers.pop(0)
print(numbers)
print(number)

# 3. count
numbers = [1, 2, 2, 3]
counts = numbers.count(2)
print(counts)

# 4. sort
numbers = [4, -1, 0, 2, 100]
numbers.sort()
print(numbers)

numbers.sort(reverse=True)
print(numbers)