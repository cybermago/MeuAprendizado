# Array manipuling
# sort, concatenate
import numpy as np

# array sort
arr = np.empty(5, dtype=int)
np.sort(arr)
print(f"{arr}")

# array concatenate
a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])
np.concatenate((a, b))
print(f"concatenate1: {np.concatenate((a, b))}")

x = np.array([[1, 2], [3, 4]])
y = np.array([[5, 6]])
np.concatenate((x, y), axis=0)
print(f"concatenate2:\n {np.concatenate((x, y), axis=0)}")