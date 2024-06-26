import matplotlib.pyplot as pl

fig, ax = pl.subplots()

ax.plot([1,2,3,4],[1,4,2,3])
pl.axis([0,6,0,20])
pl.show()