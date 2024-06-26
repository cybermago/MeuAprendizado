# index and slice
import numpy as np

arr = np.array([[1, 2, 3, 4], [5, 6, 7, 8]])
print(f"{arr[1]}")
# matrix slice
print(f"arr slice 0:2 {arr[0:2]}")
print(f"arr slice 1: {arr[1:]}")
print(f"arr slice -2: {arr[-2:]}\n")
print(f"arr < 5: {arr[arr < 5]}")
# matrix >=< indexing
five_up = (arr >= 5)
print(f"arr >= 5: {arr[five_up]}")
# matrix %
disisible_by_2 = arr[arr % 2 == 0]
print(f"divisible by 2: {disisible_by_2}")
# array & array
c = arr[(arr > 2) & (arr < 11)]
print(f"arr>2 & arr<11: {c}")
# & | comparasion arrays number or strings
five_up = (arr > 5) | (arr == 5)
print(f"comparasion matrix: {five_up}\n")
# selecting index array np.nonzero
arr = np.nonzero(arr < 5)
print(f"{arr}")
# compact array
listofcoordinates = list(zip(arr[0], arr[1]))
for coord in listofcoordinates:
    print(coord)
# 
not_there = np.nonzero(arr == 42)
print(not_there)