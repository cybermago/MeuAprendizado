#
#
import numpy as np
import pandas as pd

a = np.array([[-2.58289208,  0.43014843, -1.24082018, 1.59572603],
              [ 0.99027828, 1.17150989,  0.94125714, -0.14692469],
              [ 0.76989341,  0.81299683, -0.95068423, 0.11769564],
              [ 0.20484034,  0.34784527,  1.96979195, 0.51992837]])
df = pd.DataFrame(a)
print(df)
# salvar dataframe array
df.to_csv('pd.csv')
# read array dataframe
data = pd.read_csv('pd.csv')
#
np.savetxt('np.csv', a, fmt='%.2f', delimiter=',', header='1, 2, 3, 4')