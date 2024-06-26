import tensorflow as tf
from tensorflow import keras

import numpy as np
import matplotlib.pyplot as pl

fashion_mnist=keras.datasets.fashion_mnist
(train_images, train_labels), (test_images, test_labels) = fashion_mnist.load_data()

class_names=['T-shirt/top', 'Trouser', 'Pullover', 'Press', 'Coat', 'Shirt', 'Sneaker', 'Bag', 'Ankle boot']

train_images.shape
len(train_labels)
train_labels
test_images.shape
len(test_labels)

pl.figure()
pl.imshow(train_images[0])
pl.colorbar()
pl.grid(False)
pl.show()
pl.figure(figsize=(10,10))
for i in range(25):
    pl.subplot(5,5,i+1)
    pl.xticks([])
    pl.yticks([])
    pl.grid(False)
    pl.imshow(train_images[i], cmap=pl.cm.binary)
    pl.xlabel(class_names[train_labels[i]])
pl.show()

model = keras.Sequential([
    keras.layers.Flatten(input_shape=(28, 28)),
    keras.layers.Dense(128, activation='relu'),
    keras.layers.Dense(10, activation='softmax')
])

model.compile(optmizer='adam',
              loss='sparse_categorical_crossentropy',
              metrics=['accuracy'])

model.fit(train_images, train_labels, epochs=10)

test_loss, test_acc=model.evaluate(test_images, test_labels, verbose=2)
print("accuray:", test_acc)
predictions=model.predict(test_images)
predictions[0]

def plot_image(i, predictions_array, true_label, img):
    predictions_array, true_labels, img=predictions_array[i],true_labels[i],img[i]
    pl.grid(False)
    pl.xticks([])
    pl.yticks([])

    pl.imshow(img, cmap=pl.cm.binary)

    predicted_label=np.argmax(predictions_array)
    if predicted_label==true_label:
        color='blue'
    else:
        color='red'

    pl.xlabel("{} {:2.0f}% ({})".format(class_names[predicted_label],
                                        100*np.max(predictions_array),
                                        class_names[true_label]),
                                        color=color)

def plot_value_array(i, predictions_array, true_label):
    predictions_array, true_label = predictions_array[i], true_label[i]
    pl.grid(False)
    pl.xticks([])
    pl.yticks([])
    thisplot=pl.bar(range(10), predictions_array, color="#777777")
    pl.ylim([0, 1])
    predicted_label=np.argmax(predictions_array)

    thisplot[predicted_label].set_color('red')
    thisplot[true_label].set_color('blue')

i=0
pl.figure(figsize=(6,3))
pl.subplot(1,2,1)
plot_image(i, predictions, test_labels, test_images)
pl.subplot(1,2,2)
plot_value_array(i,predictions, test_labels)
pl.show

num_rows=5
num_cols=3
num_images=num_rows*num_cols
num_images=num_rows*num_cols
pl.figure(figsize=(2*2*num_cols, 2*num_rows))
for i in range(num_images):
    pl.subplot(num_rows, 2*num_cols, 2*i+1)
    plot_image(i, predictions, test_labels, test_images)
    pl.subplot(num_rows, 2*num_cols, 2*i+2)
    plot_value_array(i, predictions, test_labels)
pl.show()

img=test_images[0]
print(img.shape)
img=(np.expand_dims(img,0))
print(img.shape)
predictions_single=model.predict(img)
print(predictions_single)

plot_value_array(0, predictions_single, test_labels)
_=pl.xticks(range(10),class_names, rotation=45)
np.argmax(predictions_single[0])