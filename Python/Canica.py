class Canica():
    __tamano = None
    __peso = None

    def getTamano(self):
        return self.__tamano

    def getPeso(self):
        return self.__peso

    def setTamano(self, tamano):
        self.__tamano = tamano

    def setPeso(self, peso):
        self.__peso = peso


def main():
    miCanica = Canica()
    print("EL estado actual del objeto es: ")
    print("EL tamano del atributo tamano de miCanica es: ", miCanica.getTamano(
    ), "\nEl peso de atributo peso de miCanica es: ", miCanica.getPeso())

    miCanica2 = Canica()
    tamano2 = "Grande"
    peso2 = 12.3
    miCanica2.setTamano(tamano2)
    miCanica2.setPeso(peso2)
    print("EL estado actual del objeto es: ")
    print("EL tamano del atributo tamano de miCanica2 es: ", miCanica2.getTamano(
    ), "\nEl peso de atributo peso de miCanica2 es: ", miCanica2.getPeso())


if __name__ == '__main__':
    main()
