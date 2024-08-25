invite_list = ['Nicolas Tesla', 'Benjamin Franqulin', 'Alan Turing']
invite = "gostaria de convidar Sr.{} para um jantar\n"
invite_canceled = "lamento por não poder convidalo para o jantar Sr."
print(invite.format(invite_list[0].title()))
print(invite.format(invite_list[1].title()))
print(invite.format(invite_list[2].title()))
print("Convidados:", len(invite_list))

canceledinvite = invite_list.pop(1)
print("<--pop invited-->")
print("Sr.", canceledinvite, "não podera comparecer ao jantar")
print("Convidados:", len(invite_list))
invite_list.insert(1, 'Socrates')
print("<--invited-->")
print(invite.format(invite_list[1]))
print("Convidados:", len(invite_list))
invite_list.insert(0, "Giodarno Bruno") 
invite_list.insert(0, "Leonardo da Vinci")
invite_list.append("Friderich Gauss")
print("<--new invited-->")
print("Convidados:", len(invite_list))
invitedsall = invite_list
print(f"Encontramos uma mesa maior Sr.{invitedsall}.\n")
print(invite.format(invitedsall))
print("Convidados:", len(invite_list))
print("infelizmente só poderei convidar duas pessoas")

canceledinvite = invite_list.pop()
print("<--invited[0] pop-->")
print(invite_canceled, canceledinvite, "\n")
canceledinvite = invite_list.pop()
print("<--invited[1] pop-->")
print(invite_canceled, canceledinvite, "\n")
canceledinvite = invite_list.pop()
print("<--invited[2] pop-->")
print(invite_canceled, canceledinvite, "\n")
canceledinvite = invite_list.pop()
print("<--invited[3] pop-->")
print(invite_canceled, canceledinvite, "\n")
print("Convidados:", len(invite_list))
print("Sr.", invite_list, "ainda estão convidados\n")

del invite_list[0]
del invite_list[0]
print(invite_list)