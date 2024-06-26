# shape and len array
# ndim, size, shape
# ndim - total axis
# size - total items
# shape - total dimensions rows and cols
# reshape - new dimensions
import numpy as np

# array ndim, size, shape
array_example = np.array([[[0, 1, 2, 3],
                           [4, 5, 6, 7]],
                          [[0, 1, 2, 3],
                           [4, 5, 6, 7]],
                          [[0, 1, 2, 3],
                           [4, 5, 6, 7]]])
print(f"total dimensions: {array_example.ndim}")
print(f"total items: {array_example.size}")
print(f"dimensions: {array_example.shape}")

# array reshape
a = np.arange(6)
b = a.reshape(3, 2)
print(b)
# newshape - news dimensions
# order C - read/write items
np.reshape(a, newshape=(1, 6), order='C')