# Convert 1D to 2D and new axis
# array newaxis
# array expand
import numpy as np


# newaxis eixo na posição x e y
a = np.array([1, 2, 3, 4, 5])
print(f"array: {a.shape}")
a2 = a[np.newaxis, :]
print(f"newaxis: {a2.shape}\n")
row_vector = a[np.newaxis, :]
print(f"newaxis_rows: {row_vector.shape}")
col_vector = a[:, np.newaxis] # newaxis to second
print(f"newaxis_cols: {col_vector.shape}\n")

# newaxis expand_dims eixo em qualquer indice
b = np.expand_dims(a, axis=1)
print(f"newaxis expand: {b.shape}")