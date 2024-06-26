import numpy as np
import matplotlib.pyplot as pl

x=np.linspace(0,2,100)

fig, ax=pl.subplots()

ax.plot(x, x, label='linear')

ax.plot(x, x**2, label='quadratic')

ax.plot(x, x**3, label='cubic')

ax.set_xlabel('x label')

ax.set_ylabel('y label')

ax.set_title('simple')
ax.legend()