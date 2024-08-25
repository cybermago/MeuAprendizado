from pathlib import Path

path = Path('guest.txt')
value = input("Seu nome:")
path.write_text(value)