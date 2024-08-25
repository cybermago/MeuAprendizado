glossary = {'recursive': 1,
            'poo': 2,
            'herança': 3,
            'polimorfismo': 4,
            'imperativa': 5}
value = glossary.get('procedural', 3)
for k, v in glossary.items():
    print(f"{k}:{v}")