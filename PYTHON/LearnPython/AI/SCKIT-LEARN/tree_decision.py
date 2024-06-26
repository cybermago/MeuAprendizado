import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score
from sklearn.preprocessing import OneHotEncoder

# Carregando o dataset
df = pd.read_csv('diagnostics.csv')

# Removendo a coluna de data 'data_diagnostico'
df.drop('data_diagnostico', axis=1, inplace=True)

# Selecionando as colunas categóricas para codificação
categorical_cols = ['nome', 'resultado', 'tipo', 'orgão', 'codigo', 'estado_cancer', 'tratamento', 'medicação', 'hospital']

# Aplicando OneHotEncoder nas colunas categóricas
encoder = OneHotEncoder(sparse_output=False)
encoded_columns = encoder.fit_transform(df[categorical_cols])
df_encoded = pd.concat([df, pd.DataFrame(encoded_columns, columns=encoder.get_feature_names_out(categorical_cols))], axis=1)

# Removendo as colunas originais após a codificação
df_encoded.drop(categorical_cols, axis=1, inplace=True)

# Separando as features e o target
X = df_encoded.drop('estado', axis=1)
y = df_encoded['estado']

# Dividindo o dataset em treino e teste
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Criando o modelo de Árvore de Decisão
dt = DecisionTreeClassifier(random_state=42)

# Treinando o modelo de Árvore de Decisão
dt.fit(X_train, y_train)

# Fazendo previsões com Árvore de Decisão
y_pred_dt = dt.predict(X_test)

# Calculando a acurácia para Árvore de Decisão
accuracy_dt = accuracy_score(y_test, y_pred_dt)
print(f'Acurácia da Árvore de Decisão: {accuracy_dt}')

# Criando o modelo de Floresta Aleatória
rf = RandomForestClassifier(n_estimators=100, random_state=42)

# Treinando o modelo de Floresta Aleatória
rf.fit(X_train, y_train)

# Fazendo previsões com Floresta Aleatória
y_pred_rf = rf.predict(X_test)

# Calculando a acurácia para Floresta Aleatória
accuracy_rf = accuracy_score(y_test, y_pred_rf)
print(f'Acurácia da Floresta Aleatória: {accuracy_rf}')
