dict = {'nile': 'egypt',
        'eufrates': 'israel',
        'são francisco': 'brasil'}

for k, v in dict.items():
    print(f"o rio {k} atravessa {v}\n")
for k in dict.keys():
    print(f"{k}\n")
for v in dict.values():
    print(f"{v}")