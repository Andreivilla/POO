from setor import Setor
from produto import Produto

def addProduto():
    produto = Produto()
    print("IdProduto: ")
    produto.setIdProduto(input())
    print("Nome: ")
    produto.setNome(input())
    print("Preco: ")
    produto.setPreco(input())
    return produto


setor = Setor()

setor.setIdSetor(input())
for i in range(3):
    setor.addProduto(addProduto())

print("\nPrintar lista de produtos\n")
for produto in setor.getListaProduto():
    print(produto)
