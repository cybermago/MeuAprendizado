import pandas as pd
from sklearn.cluster import KMeans
from sklearn.metrics import silhouette_score
from sklearn.model_selection import train_test_split
from sklearn.decomposition import PCA
import seaborn as sb
import matplotlib.pyplot as pl

df = pd.read_csv('Iris.csv', sep=',')
f = df.drop('Species', axis=1)
pca = PCA(n_components=2).fit_transform(f)
kmeans = KMeans(n_clusters=2)
kmeans.fit(f)
ftrain, ftest = train_test_split(f, train_size=2/3)
acuracia = silhouette_score(pca, kmeans.labels_)
print(kmeans.labels_)
print(acuracia)
pl.plot = sb.pairplot(df, hue='Species')
pl.show()