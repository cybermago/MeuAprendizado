# max, min, media, produto, desvio padrão
import numpy as np

# 
data = np.array([[1,2,3,4], [3,4,5,6]])
print(f"max: {data.max()}")
print(f"min: {data.min()}")
print(f"sum: {data.sum()}")
a = np.array([[0.45053314, 0.17296777, 0.34376245, 0.5510652],
              [0.54627315, 0.05093587, 0.40067661, 0.55645993],
              [0.12697628, 0.82485143, 0.26590556, 0.56917101]])
print(f"sum: {a.sum()}")
print(f"min: {a.min()}")
a.min(axis=0)
print(f"axis:\n{a}")