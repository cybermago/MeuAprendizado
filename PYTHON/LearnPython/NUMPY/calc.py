import numpy as np

a = np.array([1, 2, 3])
print("soma:", a.sum())
print("media:", a.mean())
print("maximo", a.max())
print("minimo", a.min())
x = np.array([[1, 2], [3, 4], [4, 5]])
np.median(x, axis=0)
print("media da matriz x:", x)