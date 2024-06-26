pizzas = ['frango-cremoso', 'frango-supremo', 'frango-catupiry']

#for pizza in pizzas:
#    print(f"gosto de {pizza.title()}")
#print(f"gosto demais de {pizzas}\nComo eu amo Pizza")

friend_pizzas = pizzas[:]
pizzas.append('frango')
friend_pizzas.append('carne')

print(f"minhas pizzas favoritas:")
for pizza in pizzas:
    print(pizzas)
    
print(f"minhas pizzas favoritas:")
for pizza in friend_pizzas:
    print(friend_pizzas)
    