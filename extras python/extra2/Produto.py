class Produto:
    def __init__(self, nome, preco, idProduto):
        self.nome = nome
        self.preco = preco
        self.idProduto = idProduto
        pass
    
    #getters
    def getNome(self):
        return self.nome
    
    def getPreco(self):
        return self.preco
    
    def getIdProduto(self):
        return self.idProduto
    
    #setters
    def setNome(self, nome):
        self.nome = nome

    def setPreco(self, preco):
        self.preco = preco

    def setIdProduto(self, id):
        self.idProduto = id

    def __str__(self):
        return f'Nome: {self.nome}\n Preco: {self.preco}\n IdProduto: {self.idProduto}'

