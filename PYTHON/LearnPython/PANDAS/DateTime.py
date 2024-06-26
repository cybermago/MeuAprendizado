import pandas as pd
import numpy as np

dates = pd.date_range('01012024', periods=1)
DateTimeIndex(['02-03-2024'], dtype='datetime64[ns]', freq='D')

df = pd.DataFrame(np.random.randn(2, 1), index=dates, columns=list('A'))

print(df)