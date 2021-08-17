
import json
from filme import Filme



f = open('extra3\\filmes.json', 'r')
texto = f.read()
listaFilmesJson = json.loads(texto)

listaFilmesObjetos = []

for filme in listaFilmesJson:
    add = Filme(filme['titulo'], filme['ano'], filme['classificacao'], filme['nota'])
    listaFilmesObjetos.append(add)

print("\nAntes deordenar\n")
for filme in listaFilmesObjetos:
    print(filme)

listaFilmesObjetos = sorted(listaFilmesObjetos, key=Filme.getNota)

print("\ndepois de deordenar\n")
for filme in listaFilmesObjetos:
    print(filme)