#
# flatten ravel
import numpy as np

# nivelamento de matrizes
x = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
print(x.flatten)
#
a1 = x.flatten()
a1[0] = 99
print("\n", x, "\n") # Original array
print(a1)  # New array
#
a2 = x.ravel()
a2[0] = 98
print(x) # Original array
print(a2)  # New array