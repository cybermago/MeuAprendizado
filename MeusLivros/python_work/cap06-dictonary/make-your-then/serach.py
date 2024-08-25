# search in keys and comparasion values

favorite_languages = {
    'jen': 'python',
    'sara': 'c',
    'edward': 'rust',
    'phil': 'python',
    'ithan': '',
    'garby': ''
}

for k, v in favorite_languages.items():
    if k != 'garby' and k != 'ithan':
        print(f"agradecemos a resposta {k}")
    else:
        print(f"convidado {k} a participar")