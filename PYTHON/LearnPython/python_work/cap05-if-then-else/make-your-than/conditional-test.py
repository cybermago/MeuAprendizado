test1 = ('teste', 'teste02')
test2 = ['teste', 'teste02']
a = int(10)
b = float(10)
sum = a + b
bank = 'caixa'
cnpj = "00.360.305/0001-04"
name = '00'
full_name = f'{name}'
https = 'https://www.newyorktimes.com.br'
http = "https://"

if len(test1) > 0 and len(test2) > 1:
    print("ok".lower())
    print()
else:
    if len(cnpj) >= 5 or name != 'nome completo':
        print("completo".upper())
    else:
        print(None)
if http in https == 'https://':
    print(https.removeprefix('https://'))
else:
    print(None)

if name in bank == 'caixa':
    test1.append('carro')