class Jogador:
    """Esta é a classe jogador"""
    __nome = ""
    __posicao = ""
    __peso = 0.0
    __altura = 0.0
    __velocidade = 0.0

    def __init__(self, nome, posicao,peso, altura, velocidade):
        self.__nome = nome
        self.__posicao = posicao
        self.__peso = peso
        self.__altura = altura
        self.__velocidade = velocidade

    def getVelocidade(self):
        return self.__velocidade
    
    def setVelocidade(self, velocidade):
        self.__velocidade = velocidade

    def getPeso(self):
        return self.__peso
    
    def getAltura(self):
        return self.__altura

    def getNome(self):
        return self.__nome
    
    def getPosicao(self):
        return self.__posicao
    
    def __str__(self):
        return self.__nome + " - " + self.__posicao + " - " + str(self.__velocidade)
    