class PuntosCoordenados():
    __x = 0.0
    __y = 0.0

    def getX(self):
        return self.__x

    def getY(self):
        return self.__y

    def __init__(self, x, y):
        self.__x = x
        self.__y = y

    def calculateDistance(self, point2):
        point2 = PuntosCoordenados(point2.getX(), point2.getY())
        return round(((point2.getX() - self.getX()) ** 2 + (point2.getY() - self.getY()) ** 2) ** 0.5, 3)


def main():
    x1 = float(input("Ingrese el valor de x1: "))
    y1 = float(input("Ingrese el valor de y1: "))
    punto1 = PuntosCoordenados(x1, y1)
    x2 = float(input("Ingrese el valor de x2: "))
    y2 = float(input("Ingrese el valor de y2: "))
    punto2 = PuntosCoordenados(x2, y2)
    print(punto1.calculateDistance(punto2))


if __name__ == '__main__':
    main()
