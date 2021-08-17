from pessoa import Pessoa
class Aluno(Pessoa):
    def __init__(self, nome, notas):
        self.nome = nome
        self.notas = notas

    def calcularMedia(self):
        somatorio=0 
        
        for nota in self.notas:
            somatorio += nota
        
        return somatorio/len(self.notas)

    def __repr__(self):
        s = ""
        s += "Nome: " + self.nome + "\n"
        for i in range(len(self.notas)):
            s += "Nota: " + str(i) + ": " + str(self.notas[i])
            s += "\n"
        s += "Media: " + str(self.calcularMedia())
        s += "\nEstado atual: " + ("Aprovado" if self.calcularMedia()>=7 else "Reprovado")

        return s