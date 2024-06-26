#K vizinhos
from sklearn.model_selection import train_test_split
from sklearn.neighbors import KNeighborsClassifier
from sklearn.metrics import accuracy_score
import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv('emprestimo.csv', sep=',')
df =df.drop(['id'], axis=1)
f = df[['idade', 'saldo']]
c = df['risco']
#classificador = KNeighborsClassifier (n_neighbors=3)
ftrain, ftest, ctrain, ctest = train_test_split(f, c, train_size=0.67, random_state=42)
classificadormelhorado = KNeighborsClassifier (n_neighbors=4)
classificadormelhorado.fit(ftrain, ctrain)
previsao = classificadormelhorado.predict([[56, 3200]])
acuracia = accuracy_score(ctest, classificadormelhorado.predict(ftest))
print(f.head())
print(df.dtypes)
print(previsao)
plt.plot(acuracia, 'o', linewidth=2)
plt.show()