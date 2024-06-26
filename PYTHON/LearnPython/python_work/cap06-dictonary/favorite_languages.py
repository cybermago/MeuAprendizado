# Favorite Languages

favorite_languages = {
    'jen': 'python',
    'sara': 'c',
    'edward': 'rust',
    'phil:': 'python',
}

language = favorite_languages['sara'].title()
print(f"Sarah's favorite language is {language}.")

for name in favorite_languages.keys():
    print(name.title())
