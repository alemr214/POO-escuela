class Cartera():
    __numeroBolsillos = None
    __tipo = None

    def getNumeroBolsillos(self):
        return self.__numeroBolsillos

    def getTipo(self):
        return self.__tipo

    def setNumeroBolsillos(self, numeroBolsillos):
        self.__numeroBolsillos = numeroBolsillos

    def setTipo(self, tipo):
        self.__tipo = tipo

    def __init__(self, numeroBolsillos, tipo):
        self.__numeroBolsillos = numeroBolsillos
        self.__tipo = tipo


def main():
    numeroBolsillo = int(input("Ingresa el numero de bolsillos: "))
    tipo = input("Ingresa el tipo de cartera: ")
    miCartera = Cartera(numeroBolsillo, tipo)

    print("El estado del objeto es: ")
    print("El numero de bolsillos es: ", miCartera.getNumeroBolsillos(),
          "\nEl tipo es: ", miCartera.getTipo())

    miCartera2 = Cartera(4, "mujer")
    print("El estado del objeto es: ")
    print("El numero de bolsillos es: ", miCartera.getNumeroBolsillos(),
          "\nEl tipo es: ", miCartera2.getTipo())


if __name__ == '__main__':
    main()
