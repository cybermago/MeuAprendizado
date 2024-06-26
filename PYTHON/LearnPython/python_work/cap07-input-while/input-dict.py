responses = {}
# Define uma flag para sinalizar que a pesquisa está ativa
polling = True

while polling_active:
    # Solicita o nome e a resposta do participante
    name = input("\n:What is your name?")
    response = input("Which montain would you like to climb someday?")
    
    # armazena a resposta no dicionario
    responses[name] = response
    
    # detecta se mais alguém participará da pesquisa
    repeat = input("respond?(yes/no)")
    if repeat == 'no':
        polling_active = False
        
    for name, response in responses.items():
        print(f"{name}{response}")