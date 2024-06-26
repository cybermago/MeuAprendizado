class User:
    
    def __init__(self, first_name, last_name, age, city, account):
        self.first_name = first_name
        self.last_name = last_name
        self.age = age
        self.city = city
        self.account = account
    
    def describe_user(self):
        print(f"{self.first_name}\n{self.last_name}")
    
    def greet_user(self):
        print(f"bem-vindo {self.first_name}")
    
    
user = User('j', 'a', 3, 'brasilia', 1234)
user.describe_user()
user.greet_user()