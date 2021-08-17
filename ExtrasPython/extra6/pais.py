class Pais:
    def __init__(self, nome):
        self.nome = nome
        self.listaRegiao = []

    def adicionarRegiao(self, regiao):
        self.listaRegiao.append(regiao)

    def __str__(self):
        string = f'{self.nome}\n'
        for r in self.listaRegiao:
            string += str(r) + '\n'
        return string