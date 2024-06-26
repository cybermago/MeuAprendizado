import pandas as pd
import numpy as np

a=pd.Series()
data = np.array(['a','b'])

s = pd.Series(data, index=[100, 101])
print(s)
print(a)