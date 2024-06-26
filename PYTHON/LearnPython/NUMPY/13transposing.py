# reshape transpose T
import numpy as np
 
# reshape
data = np.array([[1,2,3],
                 [4,5,6]])
print(data.reshape(2, 3))
# transpose or T
arr = np.arange(6).reshape((2, 3))
arr.transpose