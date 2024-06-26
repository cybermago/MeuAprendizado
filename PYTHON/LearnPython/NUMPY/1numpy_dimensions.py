# 0D 1D 2D
import numpy as np

#0D
arr = np.array(42)
print(f"array0D: {arr}")
#1D
arr = np.array([1, 2, 3, 4, 5])
print(f"array1D: {arr}\n")
#2D
arr = np.array([[1, 2, 3], 
                [4, 5, 6]])
print(f"array2D:\n {arr}")
print(f"{arr}\n")
# 3D
arr = np.array([[[1, 2, 3],
                 [4, 5, 6],
                 [1, 2, 3],
                 [4, 5, 6]]])
print(f"array3D: \n{arr}\n")
# 5D
arr = np.array([1, 2, 3, 4], ndmin=5)
print('5D number of dimensions :', arr.ndim)