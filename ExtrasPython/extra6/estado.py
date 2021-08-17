from typing import ClassVar

class Estado:
    def __init__(self, nome, sigla):
        self.nome = nome
        self.sigla = sigla
        self.listaCidades = []

    def adicionaCidade(self, cidade):
        self.listaCidades.append(cidade)

    def __str__(self):
        string = f'\t\t{self.nome} - {self.sigla}\n'
        for c in self.listaCidades:
            string += str(c) + '\n'

        return string