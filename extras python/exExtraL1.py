def indexString(letras, letra):
    for i in range(len(letras)):
        if letra in letras[i]:
            return int(i)

def tecladoCelular(letras):
    teclas = [(2, 'abc'), (3, 'def'), (4, 'ghi'), (5, 'jkl'), (6, 'mno'), (7, 'pqrs'), (8, 'tuv')]
    for letra in letras:
        for tecla in teclas:
            if letra in tecla[1]:
                print("aperte %i, %i vezes"%(tecla[0], indexString(tecla[1], letra)+1))
            

        
P = input()
tecladoCelular(P)