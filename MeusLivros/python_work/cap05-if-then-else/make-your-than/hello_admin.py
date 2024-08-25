# hello admin

adm = ['admin', 'supervisor', 'superadmin', 'client', 'user']
users = []
current_users = ['Jhon', 'Alice', 'nome3', 'nome4', 'nome5']
new_users = ['Jhon', 'Alice', 'nome6', 'nome6', 'nome7']

for user in adm or users or current_users or new_users:
    
    print("Usuario:")
    user = input()
    
    if user == new_users[0] or [1] or [2] or [3] or [4]:
        for user in new_users:
            print(f"Já existe insira um novo nome de usuario:")
            print("Usuario:")
            user = input()
            
            a = current_users[0]
            b = current_users[1]
            c = current_users[2]
            d = current_users[3]
            e = current_users[4]
        if user == a.lower or b.lower or c.upper or d.upper or e.upper:
            print(f"Não aceito {user} já existe")
    elif user not in new_users:
        print(f"Nome disponivel")
        
    
    if user == 'admin':
        print(f"Bem vindo: {user}")
        print(f"olá {adm[0]} gostaria de ver o relatorio?")
    
    elif user != 'admin':
        print(f"Bem vindo: {user}")
        print(f"Olá {user} obrigado por fazer login")
    
if len(users) == 0 or len(adm) == 0 or len(current_users) == 0 or len(new_users) == 0:
    print("É necessario encontrar alguns usuarios!")