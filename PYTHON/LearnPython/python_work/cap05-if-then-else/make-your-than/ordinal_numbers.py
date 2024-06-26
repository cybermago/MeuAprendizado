ordinal_numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9]

for i in ordinal_numbers:
    if i in ordinal_numbers[:2]:
        ordinal_numbers[0] = '1st'
        ordinal_numbers[1] = '2nd'
        ordinal_numbers[2] = '3rd'
    elif i in ordinal_numbers[2:]:
        f'{i}th'
    print(f"{i}th")