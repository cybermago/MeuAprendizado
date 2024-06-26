import tensorflow as tf
import matplotlib.pyplot as plt

# Criando uma matriz de exemplo usando TensorFlow
matriz = tf.random.normal([10, 10])  # Matriz 10x10 com números aleatórios

# Extraindo os valores da matriz
matriz_valores = matriz.numpy()

# Criando o gráfico com Matplotlib
plt.figure(figsize=(8, 6))
plt.imshow(matriz_valores, cmap='viridis')  # cmap='viridis' para cores amarelas a roxas
plt.colorbar()  # Adiciona a barra de cores
plt.title('Matriz Aleatória')
plt.xlabel('Eixo X')
plt.ylabel('Eixo Y')
plt.grid(False)  # Desativa as linhas de grade
plt.show()
