# SVM
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score
from sklearn.svm import SVC
import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv('emprestimo.csv', sep=',')
df =df.drop(['id'], axis=1)
f = df[['idade', 'saldo']]
c = df['risco']
ftrain, ftest, ctrain, ctest = train_test_split(f, c, train_size=0.67, random_state=42)
svm = SVC()
svm.fit(ftrain, ctrain)
acuracia = accuracy_score(ctest, svm.predict(ftest))
print(f.head())
print(df.dtypes)
print(acuracia)