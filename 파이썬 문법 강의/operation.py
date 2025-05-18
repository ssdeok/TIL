# 논리 연산자
# and(&&), or(||), not(!)

# and 정확한 수행 로직
# 좌항이 False(0, "",... )인 값이면 좌항을 반환
# 좌항이 True인 값이면 우항을 반환
print(True and True)
print(1 and 1)
print(0 and 1)

# or 정확한 수행 로직
# 좌항이 True인 값이면 좌항을 반환
# 좌항이 False인 값이면 우항을 반환
print(True or False)
print(0 or -1)
print("" or True)
print(0.0 or 10.0)
