import numpy as np
from scipy import linalg

# 1x + 2y = 5
# 3x + 4y = 6

a=np.array([[1,2],[3,4]])

b=np.array([[5],[6]])

x=linalg.solve(a,b)

print("solução")
print(x)
print(a.dot(x)-b)