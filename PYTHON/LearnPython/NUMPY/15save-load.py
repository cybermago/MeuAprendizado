# Salvar arrays .npy .npz
# save, savez, savetxt, load, loadtxt
# .npz.loadtxtsavetxtloadsavesavez
import numpy as np

# salvando um array
a = np.array([1,2,3,4,5,6])
np.save('filename', a)

# carregando um array
b = np.load('filename.npy')
print(b)

# salvando array em formato texto
csv_arr = np.array([1,2,3,4,5,6,7,8])
np.savetxt('new_file.csv', csv_arr)

# carregando array de texto
np.loadtxt('new_file.csv')