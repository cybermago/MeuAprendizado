a=0
b=0
valor = []
valores = int(input("Quantos valores quer calcular?:"))
opc = int(input("Qual operação quer fazer:"))
result = [valores, opc]
valor.append(result)

def menu(a,b):
    a = int(input("Digite o valor:"))
    b = int(input("Digite o outro valor:"))  
    
def soma(a,b):
    return a+b
    print(a,"+",b,"=",soma)
    
while(valores>2):
    ++b
    break

if(opc==1):
    menu()
    soma()
    print(soma)
elif(opc==2):
    menu()
    sub=a-b
    print(sub)
elif(opc==3):
    menu()
    multi=a*b
    print(multi)
elif(opc==4):
    menu()
    divi=a/b
    print(divi)
elif(opc==5):
    menu()
    res=a%b
    print(res)
else:
    print("errado")