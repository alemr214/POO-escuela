class FormaAsteriscos():
    __longitud = None

    def getLongitud(self):
        return self.__longitud

    def setLongitud(self, longitud):
        self.__longitud = longitud

    def dibujarLineaHorizontal(self):
        horizontal = ''
        for i in range(self.__longitud):
            horizontal += "* "
        return horizontal

    def dibujarLineaVertical(self):
        vertical = ''
        for j in range(self.__longitud):
            vertical += "*\n"
        return vertical

    def dibujarEle(self):
        formaEle = ''
        temporal = FormaAsteriscos()
        temporal.setLongitud(self.__longitud - 1)
        formaEle = formaEle + temporal.dibujarLineaVertical()
        temporal.setLongitud(self.__longitud + 1)
        formaEle = formaEle + temporal.dibujarLineaHorizontal()
        return formaEle


def main():
    asteriscos = FormaAsteriscos()
    cantidad = int(input("Ingrese la cantidad de asteriscos: "))
    asteriscos.setLongitud(cantidad)
    print("La linea horizontal queda: ")
    print(asteriscos.dibujarLineaHorizontal())
    print("La linea vertical queda: ")
    print(asteriscos.dibujarLineaVertical())
    print("La forma de ele(L) queda: ")
    print(asteriscos.dibujarEle())


if __name__ == '__main__':
    main()
