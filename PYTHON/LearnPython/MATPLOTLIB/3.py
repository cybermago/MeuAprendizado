import matplotlib.pyplot as plt
import pandas as pd

dados = pd.read_csv('dados.csv', sep=';')
pd.read_csv('dados.csv')
produtos = dados ['Produto']
ano2020 = dados['2020']
ano2021 = dados['2021']

plt.axis([0, 10, 20, 100])
plt.bar(produtos, ano2020, color='red')
plt.bar(produtos, ano2021)
plt.show()