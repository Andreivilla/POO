from pessoa import Pessoa
class Professor(Pessoa):
    def __init__(self, nome, salario):
        self.nome = nome
        self.salario = salario
    
    def __repr__(self):
        return "Nome: " + self.nome + "\nSalario: " + str(self.salario)