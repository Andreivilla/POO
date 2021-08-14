from cidade import Cidade
from regiao import Regiao
from pais import Pais
from estado import Estado

class PaisesComposite:
    def __init__(self, pais):
        self.pais = pais

    def adicionarRegiao(self, regiao):
        self.pais.adicionarRegiao(regiao)

    def adicionarEstado(self, estado, regiao):
        for r in self.pais.listaRegiao:
            if regiao == r:
                r.listaEstados.append(estado)
                return

    def adicionarCidade(self, cidade, estado, regiao):
        for r in self.pais.listaRegiao:
            if regiao == r:
                for e in r.listaEstados:
                    if e == estado:
                        e.listaCidades.append(cidade)
                        return

    def __str__(self):
        return str(self.pais)