# create array
import numpy as np

# lists of lists python
data = np.array([[1, 2], [3, 4], [5, 6]])
print(data)
# operations index and slice manipuling arrays 
data[0, 1]
data[1:3]
data[0:2, 0]
# Agregar matrizes
print(f"max: {data.max()}")
print(f"min: {data.min()}")
print(f"sum: {data.sum()}")
print(f"data: {data.max(axis=0)}")
print(f"data: {data.max(axis=1)}")
#
data = np.array([[1, 2], [3, 4]])
ones = np.array([[1, 1], [1, 1]])
print(data + ones)