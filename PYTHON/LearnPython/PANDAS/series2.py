import pandas as pd
import numpy as np

data=['a']
s=pd.Series([1,3,4,np.nan,6,8])
d=pd.DataFrame([1])

print(s+d)