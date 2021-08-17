class Cidade:
    def __init__(self, nome, populacao):
        self.nome = nome
        self.populacao = populacao

    def __str__(self):
        return f'\t\t\t{self.nome} - {self.populacao} habitantes'