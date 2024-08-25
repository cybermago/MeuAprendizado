# message = "I really like dogs."
# rint(message.replace('dog', 'cat'))

from pathlib import Path

path = Path('learning_python.txt')
read = path.read_text()

print(read.replace('Python', 'C'))