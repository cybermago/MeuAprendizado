from pathlib import Path

path = Path('programing.txt')
path.write_text('I love programing.')
contents = "I love programing\n"
contents += "I also love working with data.\n"

path.write_text(contents)