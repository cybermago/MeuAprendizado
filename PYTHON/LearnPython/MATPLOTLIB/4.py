import pandas as pd
import matplotlib.pyplot as plt
mockdata = pd.read_csv('mockdata.csv', sep=',')
brands = mockdata.loc[mockdata['marca']=='preço']
preco = brands['preço']
data = brands['device_date']
plt.scatter(preco, data)
plt.show()