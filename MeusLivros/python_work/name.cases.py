name = "erick"
message = "Olá {}, gostaria de aprender python hoje?"
print(message.format(name))
print(name.lower())
print(name.upper())
print(name.capitalize())
print('Albert Einsten disse uma vez: "Uma pessoa que nunca cometeu um erro nunca tentou nada de novo"')

famous_person = "Baruch Spinoza"
message2 = "A ingnorância é a causa das emoções negativas."
message2 = f'´{famous_person}: "{message2}"'
print(message2)

name2 = " \tJonata\n "
print(name2.lstrip())
print(name2.rstrip())
print(name2.strip())

file_name = 'python_notes.txt'
print(file_name.removesuffix(".txt"))