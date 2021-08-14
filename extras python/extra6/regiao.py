class Regiao:
    def __init__(self, nome):
        self.nome = nome
        self.listaEstados = []

    def adicionarEstado(self, estado):
        self.listaEstados.append(estado)

    def __str__(self):
        string = f'\t{self.nome}\n'
        for estados in self.listaEstados:
            string += str(estados) + '\n'
        
        return string