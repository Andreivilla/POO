from cidade import Cidade
from regiao import Regiao
from pais import Pais
from estado import Estado
from paisesComposite import PaisesComposite

#1 pais
pais = Pais("Brasil")

#2 regioes
sul = Regiao("Sul")
suldeste = Regiao("Sudeste")

#3 estados
sc = Estado("Santa Catarina", "SC")
pr = Estado("Parana", "PR")
rj = Estado("Rio de Janeiro", "RJ")

#5 Cidades
joinville = Cidade("Joinville", 597658) 
blumenau = Cidade("Blumenau", 361855) 
laguna = Cidade("Laguna", 46122)
curitiba = Cidade("Curitiba", 1948626)
rioDeJaneiro = Cidade("Rio de Janeiro", 6747815)

#criar composite
paisComposite = PaisesComposite(pais)

#adicionar regiooes 
paisComposite.adicionarRegiao(sul)
paisComposite.adicionarRegiao(suldeste)

#adicionar estados
paisComposite.adicionarEstado(sc, sul)
paisComposite.adicionarEstado(pr, sul)
paisComposite.adicionarEstado(rj, suldeste)

#adicionar cidades
paisComposite.adicionarCidade(joinville, sc, sul)
paisComposite.adicionarCidade(blumenau, sc, sul)
paisComposite.adicionarCidade(laguna, sc, sul)
paisComposite.adicionarCidade(curitiba, pr, sul)
paisComposite.adicionarCidade(rioDeJaneiro, rj, suldeste)

print(paisComposite)