import tensorflow1
import pandas as pd
import warnings
from tensorflow1.models import Sequential
from tensorflow1.layers import Dense
from tensorflow1.metrics import categorical_accuracy
import matplotlib.pyplot as pl
import seaborn as sb
warnings.filterwarnings('ignore')

df = pd.read_csv('admission_dataset.csv', sep=',')
y = df['Chance of Admit ']
x = df.drop('Chance of Admit ', axis=1)
xtrain, xtest = x[0:300], x[300:]
ytrain, ytest = y[0:300], y[300:]
print(xtrain.shape)
# criando a arquitetura da rede neural
modelo = Sequential()
modelo.add(Dense(units=999999, activation='relu', input_dim=7))
modelo.add(Dense(units=1, activation='linear'))

#treinando
modelo.compile(loss='mse', optimizer='adam', metrics=['mae'])
resultado = modelo.fit(xtrain, ytrain, epochs=50, batch_size=32, validation_data=(xtest, ytest))

#ac = categorical_accuracy()
#acuracia = categorical_accuracy(xtrain, ytrain.)

pl.plot(resultado.history['loss'])
pl.plot(resultado.history['val_loss'])
pl.show()
print(modelo.predict)