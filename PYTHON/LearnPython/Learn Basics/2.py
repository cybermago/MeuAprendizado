animais=[]

entrada=0

while entrada<=5:
    print("digite um animal:")
    animal = input()
    if len(animal) < 3:
        print("maior que 3")
    else:
        animais.append(animal)
        entrada += 1
    
print(animais)