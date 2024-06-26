import tensorflow as tf
import os
import cProfile
tf.executing_eagerly()

x=[[2.]]
m=tf.matmul(x,x)
print(m)

a=tf.constant([1,2],
              [3,4])
