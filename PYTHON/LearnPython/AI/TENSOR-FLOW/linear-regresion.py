import matplotlib.pyplot as pl
import numpy as np
import pandas as pd
import sklearn.linear_model

# carrega os dados
oecd_bli = pd.read_csv("BLI.csv", sep=',')
gdp = pd.read_csv('FDI.csv', thousands=',', delimiter='\t',
                   encoding='latin1', na_values="n/a")

def prepare_country_stats(oecd_bli, gdp):
    return pd.merge(oecd_bli, gdp, on='Country', how='inner')

#preparar os dados
country_stats = prepare_country_stats(oecd_bli, gdp)
x = np.c_[country_stats["GDP"]]
y = np.c_[country_stats['Life satisfaction']]

#visualizar os dados
country_stats.plot(kind='scatter', x='GDP', y='Life Satisfaction')
pl.show()
#Selecione um modelo linear
model = sklearn.linear_model.LinearRegression()

# Substituindo Regressão Linear por K viznhos
model = sklearn.neighbors.KNeighborsRegressor(n_neighbors=3)

#treinar o modelo
model.fit(x,y)

#efetua uma predição para chipre
X_new = [[22587]]
print(model.predict(X_new))