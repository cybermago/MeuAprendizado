# by jonata
# 21\03\2024
# lists managements
motorcycles = ['honda', 'yamaha', 'suzuki', 'ducati']

motorcycles.append('honda')
motorcycles.append('yamaha')
motorcycles.append('suzuki')
motorcycles.insert(0, 'ducati')
print("<--incert ducati-->")
print(motorcycles)
del motorcycles[0]
print("<--del motorcycles[0]-->")
print(motorcycles)

popped_motorcycle = motorcycles.pop()
print("<--pop motorcycles-->")
print(motorcycles)
print(popped_motorcycle)

last_owned = motorcycles.pop()
print("<--pop motorcycles-->")
print(f"The last motorcycle I owned was a {last_owned.title()}.")

first_owned = motorcycles.pop(0)
print("<--pop motorcycles[0]-->")
print(f"The first motorcycle I owned was a {first_owned.title()}.")

print(motorcycles)

motorcycles.remove('ducati')
print("<--remove ducati-->")
print(motorcycles)

motorcycles.insert(0, 'ducati')

too_expensive = 'ducati'
motorcycles.remove(too_expensive)
print(motorcycles)
print(f"\nA {too_expensive.title()} is too expensive for me.")