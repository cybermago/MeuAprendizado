# Intro Array
# array, zeros, ones, empty, arange, linspace, dtype
import numpy as np

# array
print(np.__version__)
a = np.array([[1, 2], [4, 5]], np.int16)
print(f"np.array:\n {a} {a.dtype}")

# array zeros
z = np.zeros([2])
print(f"np.zeros: {z} {z.dtype}")

# array ones
o = np.ones(2)
print(f"np.ones: {o}")

# array empty
empty = np.empty(2)
print(f"np.empty: {empty}")

# array interval
r = np.arange(4)
print(f"np.arange: {r}")

# array interval interval
rr = np.arange(2, 9, 2)
print(f"arange in arange: {r}")

# array linear space specy interval
l = np.linspace(0, 10, num=5)
print(f"array linespace:{l}")

# array convert float to int
x = np.ones(2, dtype=np.int64)
print(f"array convert float to int:{x}")