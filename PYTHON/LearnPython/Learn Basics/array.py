def function(array, keys, data_dict):
    if len(keys) == 0:
        return
    key = keys[0]
    value = input(f"Digite um valor para {data_dict[key]}: ")
    if len(keys) == 1:
        array[key] = value
    else:
        array[key] = {}
        function(array[key], keys[1:], data_dict)

# Dicionário com chaves
lista = {'chave1': 'Descrição 1', 'chave2': 'Descrição 2', 'chave3': 'Descrição 3'}

# Criar um array multidimensional vazio
empty_array = {}

# Preencher o array com valores fornecidos pelo usuário
function(empty_array, list(lista.keys()), lista)

# Exibir o array preenchido
print(empty_array)