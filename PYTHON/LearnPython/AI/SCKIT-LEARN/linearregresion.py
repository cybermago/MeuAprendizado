import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score

# Supondo que você tenha carregado sua base de dados em 'df'
df = pd.read_csv('mockdatasupercomplete.csv', sep=',')

# Mapear valores categóricos da coluna 'frequencia' para números
frequencia_map = {'Daily': 1, 'Weekly': 7, 'Monthly': 30, 'Once': 1, 'Seldom': 90, 'Often': 3, 'Yearly': 365, 'Never': 0}
df['frequencia_num'] = df['frequencia'].map(frequencia_map)

# Selecionar as colunas para a regressão linear
X = df[['idade', 'score_credito', 'frequencia_num']]
y = df['saldo']

# Dividir os dados em conjuntos de treino e teste
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Treinar o modelo de regressão linear
model = LinearRegression()
model.fit(X_train, y_train)

# Avaliar a acurácia do modelo usando mean_squared_error e r2_score
y_pred = model.predict(X_test)
mse = mean_squared_error(y_test, y_pred)
r2 = r2_score(y_test, y_pred)

print(f'MSE (Mean Squared Error): {mse}')
print(f'R2 Score: {r2}')

# Plotar os dados e a linha de regressão
plt.scatter(y_test, y_pred, color='blue')
plt.plot(y_test, y_test, color='red', linewidth=2, label='Linha de Regressão')
plt.xlabel('Valores reais de Saldo')
plt.ylabel('Valores previstos de Saldo')
plt.title('Regressão Linear: Valores reais vs Valores previstos')
plt.show()
