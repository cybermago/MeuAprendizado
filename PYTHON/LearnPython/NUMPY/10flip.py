#
import numpy as np

arr_2d = np.array([1,2,3,4,5,6,7,8])
reversed_arr = (arr_2d)
reversed_arr = np.flip(arr_2d)
print(reversed_arr)
#
reversed_arr_rows = np.flip(arr_2d, axis=0)
print(reversed_arr_rows)
#
reversed_arr_columns = np.flip(arr_2d, axis=1)
print(reversed_arr_columns)
# reverter coluna
arr_2d[1] = np.flip(arr_2d[1])

arr_2d[:,1] = np.flip(arr_2d[:,1])
print(arr_2d)