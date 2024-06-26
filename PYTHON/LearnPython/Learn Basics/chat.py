import tkinter as tk
from tkinter import ttk

class ChatApp:
    def __init__(self, master):
        self.master = master
        self.master.title("Chat App")
        
        # Definindo as cores de fundo
        self.background_color = '#1f1f1f'
        self.foreground_color = '#ffffff'
        self.button_color = '#4CAF50'

        # Definindo o estilo para os botões
        self.style = ttk.Style()
        self.style.configure('Custom.TButton', background=self.button_color, foreground=self.foreground_color, font=('Arial', 12, 'bold'))

        # Configurando a janela principal
        self.master.configure(bg=self.background_color)

        # Criando a área de mensagens
        self.message_frame = tk.Frame(self.master, bg=self.background_color)
        self.message_frame.pack(padx=10, pady=10)

        # Adicionando uma scrollbar para rolar as mensagens
        self.scrollbar = tk.Scrollbar(self.message_frame)
        self.scrollbar.pack(side=tk.RIGHT, fill=tk.Y)

        # Caixa de texto para exibir as mensagens
        self.message_box = tk.Text(self.message_frame, height=20, width=60, bg=self.foreground_color, fg=self.background_color, yscrollcommand=self.scrollbar.set)
        self.message_box.pack(side=tk.LEFT, fill=tk.BOTH)
        self.scrollbar.config(command=self.message_box.yview)

        # Caixa de entrada de texto para enviar mensagens
        self.input_frame = tk.Frame(self.master, bg=self.background_color)
        self.input_frame.pack(padx=10, pady=10, fill=tk.X)

        self.input_entry = tk.Entry(self.input_frame, bg=self.foreground_color, fg=self.background_color, font=('Arial', 12, 'bold'))
        self.input_entry.pack(side=tk.LEFT, expand=True, fill=tk.X)

        self.send_button = ttk.Button(self.input_frame, text="SEND", style='Custom.TButton', command=self.send_message)
        self.send_button.pack(side=tk.RIGHT)

    def send_message(self):
        message = self.input_entry.get()
        self.message_box.insert(tk.END, message + '\n')
        self.input_entry.delete(0, tk.END)


def main():
    root = tk.Tk()
    app = ChatApp(root)
    root.mainloop()


if __name__ == "__main__":
    main()
