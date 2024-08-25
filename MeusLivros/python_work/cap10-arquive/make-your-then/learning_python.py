from pathlib import Path

path = Path('learning_python.txt')
content = path.read_text()
content = content.strip()

print(content)

for line in content.splitlines():
    print(line)