import pandas as pd
import numpy as np

dados = np.array([['a', 2], ['b', 2]])
df = pd.DataFrame(dados, columns=['nome', 'id'])
print(df)

df = pd.DataFrame()
data = [['a', 1], ['b', 2], ['c', 3]]
fd = pd.DataFrame(data, columns=['nome', 'idade'])
print(df)
print(fd)
