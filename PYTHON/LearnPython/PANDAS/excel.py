import pandas as pd
import numpy as np

df3 = pd.read_excel('test.xlsx')
# print(df3.T.head())
print(df3.head())
print(df3.shape)
print(df3.info())
print(df3.describe())

