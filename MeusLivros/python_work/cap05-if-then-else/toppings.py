requested_toppings = ['mushrooms', 'green peppers', 'extra-chesse']

#if requested_topping != 'anchovies':
#    print("Hold he anchovies!")
    
#if 'mushrooms' in requested_topping:
#    print("Adding mushrooms.")
#elif 'pepperoni' in requested_topping:
#    print("Adding pepperoni.")
#elif 'extra-chesse' in requested_topping:
#    print("Adding pepperoni.")

#for requested_topping in requested_toppings:
#    if requested_topping == 'green peppers':
#        print("Sorry, we are out of green peppers right now.")
#    else:
#        print(f"Adding {requested_topping}.")
#    #print(f'adding {requested_topping}.')
#print("\nFinish make your pizza!")

#requested_toppings = []

#if requested_toppings:
#    for requested_topping in requested_toppings:
#        print(f"Adding {requested_topping}.")
#        print("\nFinish make your pizza!")
#else:
#    print("Are you sure you want s plain pizza?")

available_toppings = ['mushrooms', 'olives', 'green peppers',
                      'pepperoni', 'pineapple', 'extra chesse']

requested_toppings = ['mushrooms', 'french fries', 'extra chesse']

for requested_toppings in requested_toppings:
    if requested_toppings in available_toppings:
        print(f"Adding {requested_toppings}.")
    else:
        print(f"sorry, we don't have {requested_toppings}.")
        
print("\nFinished making your pizza!")