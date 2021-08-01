#Professores
from aluno import Aluno
from professor import Professor

#professores
Professores = []
Professores.append(Professor("Girafales", 3000))
Professores.append(Professor("Seu madruga", 1000))

#alunos
Alunos = []
Alunos.append(Aluno("Chaves", [0, 3.5,0.5,2,1]))
Alunos.append(Aluno("Nhonho", [8.5, 9, 8.5, 9, 9.5]))
Alunos.append(Aluno("Quico", [7, 8, 6.5, 8.25, 7.5]))
Alunos.append(Aluno("Chiquinha", [5.25, 7.5, 6.5, 7, 8]))
Alunos.append(Aluno("Godinez", [2,5,3,0,4]))

#exibir
print("Professores: ")
for professor in Professores:
    print(professor)


print("Alunos: ")
for aluno in Alunos:
    print(aluno)
