from jogador import Jogador

def principal():
    joao = Jogador('João','Zagueiro',69.5,1.70,20.4)
    antonio = Jogador('Antonio','Goleiro',89.5,1.90,10.4)

    print(joao.getAltura())
    print(joao.getNome())

    print(antonio.getNome())
    print(antonio.getAltura())

if __name__ == "__main__":
    principal()