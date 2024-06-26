def ehPar(number):
    if number%2==0:
     print(True)
    else:
     print(False)
ehPar(3)

def IMC(altura, peso):
 return peso/(altura**2)

def main():
 altura=float(input("altura:"))
 peso=float(input("peso:"))
 result = IMC(altura, peso)
 print("imc: {}".format(result))

if __name__ == '__main__':
    main()