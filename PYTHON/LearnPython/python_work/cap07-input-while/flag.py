# Flag

promt = "\nTeel me someting, and I will repeat it back to you:"
promt += "\nEnter 'quit to end the program. "

active = True  # <- flag
while active:
    message = input(promt)
    
    if message == 'quit':
        active = False
    else:
        print(message)