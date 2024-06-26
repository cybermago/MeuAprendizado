from pathlib import Path

path = Path('pi_digits.txt')
contents = path.read_text()
contents = contents.rstrip() # encadeamento de metodos 

for line in contents.splitlines():
    print(line)