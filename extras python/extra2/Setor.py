#modifiqueei a classe setor para focar em produtoe deixar o exemplo da aplicação na main mais eficiente
class Setor:
    def __init__(self):
        self.idSetor
        self.listaProduto = []
        pass

    #getters
    def getIdSetor(self):
        return self.idSetor
    def getListaProduto(self):
        return self.listaProduto

    #setters
    def setIdSetor(id):
        self.idSetor = id

    def addProduto(self, produto):
        self.listaProduto.append(produto)

    def __str__(self):
        
        return ()

    