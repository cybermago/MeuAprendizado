# plotando matrizes com matplotlib
import numpy as np
import matplotlib.pyplot as plt

a = np.array([2, 1, 5, 7, 4, 6, 8, 14, 10, 9, 18, 20, 22])
plt.plot(a)
plt.show()

# plotando matriz 1D
x = np.linspace(0, 5, 20)
y = np.linspace(0, 10, 20)
plt.plot(x, y, 'purple') # line
plt.plot(x, y, 'o') # dots
plt.show()

#
fig = plt.figure()
ax = fig.add_subplot(projection='3d')
x = np.arange(-5, 5, 0.15)
y = np.arange(-5, 5, 0.15)
x, y = np.meshgrid(x, y)
r = np.sqrt(x**2 + y**2)
z = np.sin(r)
ax.plot_surface(x,y,z, rstride=1,cstride=1,cmap='viridis')
plt.show()