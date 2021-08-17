#modifiqueei a classe setor para focar em produtoe deixar o exemplo da aplicação na main mais eficiente
class Setor:
    def __init__(self, idSetor = None, nome = None):
        self.idSetor = idSetor
        self.nome = nome
        self.listaProduto = []
        pass

    #getters
    def getNome(self):
        return self.nome
    def getIdSetor(self):
        return self.idSetor
    def getListaProduto(self):
        return self.listaProduto

    #setters
    def setIdSetor(self, id):
        self.idSetor = id
    def addProduto(self, produto):
        self.listaProduto.append(produto)
    def setNome(self, nome):
        self.nome = nome

    def __str__(self):
        str = "Nome: {self.nome}\n Id Setor: {self.idSetor}\n"
        for produto in self.getListaProduto():
            str += produto
        return str