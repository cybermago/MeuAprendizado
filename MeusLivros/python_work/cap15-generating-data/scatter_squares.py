import matplotlib.pyplot as plt

x_values = range(1, 1000)
y_values = [x**2 for x in x_values]

plt.style.use('bmh')
fig, ax = plt.subplots()
ax.scatter(x_values, y_values, s=10)
ax.set_title("", fontsize=14)
ax.set_xlabel("", fontsize=14)
ax.set_ylabel("", fontsize=14)
ax.tick_params(labelsize=14)
ax.axis([0, 1100, 0, 1_100_000])
plt.show()