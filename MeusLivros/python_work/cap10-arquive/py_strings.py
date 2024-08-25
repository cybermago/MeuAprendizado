# read and whrite archive python

from pathlib import Path

path = Path('pi_million_digits.txt')
contents = path.read_text()

# access lines archive
lines = contents.splitlines()
pi_string = ''
for line in lines:
    pi_string += line
    
print(f"{pi_string[:52]}...")
print(len(pi_string))