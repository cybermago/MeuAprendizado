import matplotlib.pyplot as plt


x = [1,5,9,10,11,12]
y = [10,20,30,40,50,60]
y2 = [2.2, 3.2, 4.2, 5.2, 6.2, 7.2]
y3 = []

plt.plot(x, y, ':' 'ro', label='linewidth')
plt.plot(x, y2, '-' 'bo')
plt.axis([0, 30, 2, 50])
plt.grid(color='black')
plt.title("Evaluation")
plt.xlabel('Number')
plt.ylabel('Number')
plt.show()