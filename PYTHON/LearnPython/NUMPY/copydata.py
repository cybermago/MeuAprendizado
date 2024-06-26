# create array by existing array
# np.vstack, np.hstack, np.hsplit, view, copy
import numpy as np

#
a = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
arr1 = a[3:8]
print(f"slice array: {arr1}\n")

# stack arrays - empilhar matrizes
a1 = np.array([[1, 1],
               [2, 2]])
               
a2 = np.array([[3, 3],               
               [4, 4]])
print(f"vstack:\n {np.vstack((a1, a2))}")
print(f"hstack:\n {np.hstack((a1, a2))}\n")

# hsplit
x = np.arange(1, 25).reshape(2, 12)
np.hsplit(x, 3)
print("hplit:", x)
np.hsplit(x, (3, 4))
print("hplit:", x)
#
a = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
b1 = a[0, :]
b1[0] == 99
print(f"{b1}\n{a}")
b2 = a.copy