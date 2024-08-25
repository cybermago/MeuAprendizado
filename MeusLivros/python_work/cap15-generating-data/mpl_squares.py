import matplotlib.pyplot as plt

input_values = [1,2,3,4,5]
squares = [1, 4, 9, 16, 25]
plt.style.use('Solarize_Light2')
fig, ax = plt.subplots()
ax.plot(input_values, squares, linewidth=3) # essppessura da linha
# Define o título do gráfico e os eixos do rótulo
ax.set_title("Square Numbers", fontsize=24) # Titulo Geral
ax.set_xlabel("Value", fontsize=14)
ax.set_ylabel("Square of Value", fontsize=14)

# Define o tamanho dos rótulos de marcação de escala
ax.tick_params(labelsize=14) # estiliza as marcações
plt.show()