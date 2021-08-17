from ponto2D import Ponto2D
class Reta:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def f(self, x):
        return self.a*x + self.b

    def intercepta(self, reta):
        #para verficar seduyas retas se inteceptam num plano 
        # 2d basta verificar se naão são paralelas
        #calculando seus coeficientes angulares 
        coefAngularA = (self.f(5) - self.f(1))/(5-1)
        coefAngularB = (reta.f(5) - reta.f(1))/(5-1)
        if coefAngularA == coefAngularB:
            #ainda é preciso verificar se não são sobrepostas 
            # assim interceptando em iunfinitos pontos
            #verificando um ponto saberemos
            if reta.f(1) == self.f(1):
                return True
            else:
                False
        else:
            return True

    def estaNaReta(self, ponto):
        if self.f(ponto.x) == ponto.y:
            return True
        else:
            return False