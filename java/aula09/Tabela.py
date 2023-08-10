

class Tabela:
    def main(self):
        linhas = 8
        colunas = 8
        lista_linhas = [None] * linhas
        for i in range(0,linhas):
            inteiros = [None] * colunas
            for j in range(0,colunas):
                inteiros[j] = str(i) + "-" + str(j)
            lista_linhas[i] = inteiros

        for linha in lista_linhas:
            for coluna in linha:
                print(coluna)


if __name__ == "__main__":
    tabela = Tabela()
    tabela.main()            


