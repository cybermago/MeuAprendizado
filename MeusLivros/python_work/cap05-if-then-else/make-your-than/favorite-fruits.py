favorite_fruits = ['maçam', 'melancia', 'laranja', 'mexerica']

if 'maçam' in favorite_fruits:
    print(f"gosta de {favorite_fruits[0]} ?")
#
elif favorite_fruits == 'melancia':
    print(f'gosta de {favorite_fruits[1]} ?')
#   
elif favorite_fruits == 'laranja':
    print(f'gosta de {favorite_fruits[2]}')
#   
elif favorite_fruits == 'mexerica':
    print(f'gosta de {favorite_fruits[3]}')
#   
elif 'pessego' not in favorite_fruits:
    favorite_fruits.append('pessego')
    print(f'gosta de {favorite_fruits[0]}')
