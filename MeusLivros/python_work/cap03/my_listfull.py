# by Jonata
# 22\03\2024
# List full, pop, remove, incert, append, del, sort, sorted, len 

list1 = ['math finance', 'prob-estatistica', 'compliance']
list2 = ['portugues', 'ingles']
list3 = ['java', 'python', 'cobol', 'kotlin']
list4 = []
list5 = []
list6 = []
message = "vou dominar: {}"
message1 = "vou ser senior em: {}"
message2 = "dominei: {}"
message3 = "depois que deminar: {}"
message4 = "sou mestre em: {}"


print(message.format(list1))
print(message.format(list2))

list1, list2, list3.sort()

list1_popeed = list1.pop()
print(message.format(list1_popeed, "\n"))
list1_popeed = list1.pop()
print(message.format(list1_popeed, "\n"))
list1_popeed = list1.pop()
print(message.format(list1_popeed, "\n"))
list2_popeed = list2.pop()
print(message.format(list2_popeed, "\n"))
list2_popeed = list2.pop()
print(message.format(list2_popeed, "\n"))

list1, list2.sort(reverse=True)

print(message2, len(list1_popeed), )
print(message2, len(list2_popeed), )
list4.append(list1_popeed)
list5.append(list2_popeed)
list1.insert(0, "cobol")
print(f"aprendi {list}")
list1.remove('cobol')
list6.append(list1)
del list3[0]
print(list6)