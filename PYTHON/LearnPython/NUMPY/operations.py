# Basic Oprations for array
# + - / * % **
import numpy as np

# + - * /
data = np.array([1, 2])
ones = np.ones(2, dtype=int)
data + ones
data - ones
data * data
data / data 
# sum
a = np.array([1, 2, 3, 4])
a.sum()
b = np.array([[1, 1], [2, 2]])
b.sum(axis=0)
b.sum(axis=1)