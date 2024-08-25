from pathlib import Path

path = Path('guest_book.txt')
active = True

while active:
    value = input("Seu Nome:")
    resp = f"{value}\n"
    path.write_text(resp)
if value == 'quit':
    active = False