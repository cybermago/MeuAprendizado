# Introducing Dictionary

alien_0 = {'color': 'green', 'points': 5}

new_points = alien_0['points']

alien_0['x_position'] = 0
alien_0['y_position'] = 25
#print(alien_0)
#print(f"You just earned {new_points} points!")

#print(alien_0['color'])
#print(alien_0['points'])

#alien_0 = {}
alien_0['color'] = 'green'
alien_0['points'] = 5
#print(alien_0)

alien_0 = {'color': 'green'}
#print(f"The alien is {alien_0['color']}")

alien_0['color'] = 'yellow'
#print(f"The alien is now {alien_0['color']}.")

alien_0 = {'x_position': 0, 
           'y_position': 25, 
           'speed': 'medium',
           'color': 'green',
           'points': 5
           }
print(f"Original position: {alien_0['x_position']}")

# Desloca o alien para direita
# Estipula a distância que o alien deve percorrer conforme sua velocidade
if alien_0['speed'] == 'slow':
    x_increment = 1
elif alien_0['speed'] == 'medium':
    x_increment = 2
else:
    # Com isso, o alien fica veloz
    x_increment = 3
    
# a posição nova é a posição antiga mais o incremento
alien_0['x_position'] = alien_0['x_position'] + x_increment

print(f"New position: {alien_0['x_position']}")

alien_0['speed'] = 'fast'

del alien_0['points'] #remoção permanente
print(alien_0)