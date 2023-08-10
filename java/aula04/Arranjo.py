import random


class Arranjo:
    def main(self):
        """Função para entrar um número e criar lista de valordes de valores do tipo int, string e double"""

        limite = input("Digite um número:")

        listaInteiros = [None] * int(limite)
        listaStrings = [None] * int(limite)
        listaDoubles = [None] * int(limite)

        for i in range(0, int(limite)):
            listaInteiros[i] = 1000 + i
            listaDoubles[i] = float(i) * 1.5
            listaStrings[i] = "String n°" + str(i)

        for i in range(0, int(limite)):
            valor = random.randint(0, int(limite)-1)
            print("item " + str(i) + "\nInteiro: " + str(listaInteiros) +
                  "\nString:" + str(listaStrings) + "\nDouble:" + str(listaDoubles))

        if __name__ == "__main__":
            arranjo = Arranjo()
            arranjo.main()
