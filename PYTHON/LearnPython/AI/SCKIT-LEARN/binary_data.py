#
import pandas as pd
from pandas.core.arrays import sparse
from sklearn.preprocessing import OneHotEncoder
import numpy as np
import sklearn; print(sklearn.__version__)

df = pd.read_csv('mockdatasupercomplete.csv', sep=',')
f = df.drop('risco_emprestimo', axis=1)
c = df.risco_emprestimo
# Identificando e selecionando as colunas categóricas
categoricos = f.select_dtypes(include='object')

# Inicializando o OneHotEncoder
onehot = OneHotEncoder(sparse_output=False, drop='first')  # sparse=False para obter uma matriz densa

# Codificando as colunas categóricas
binaries = onehot.fit_transform(categoricos)
unir = np.append(f, binaries, axis=1)
print(unir)