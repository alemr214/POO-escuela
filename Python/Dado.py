from random import randint


class Dado():
    __valorDado = None

    def getValorDado(self):
        return self.__valorDado

    def setValorDado(self, valorDado):
        self.__valorDado = valorDado

    def generarNumero(self):
        self.__valorDado = randint(1, 6)
        return self.__valorDado


def main():
    miDado = Dado()
    cantidadTiros = int(input("Ingrese la cantidad de tiros: "))
    for i in range(cantidadTiros):
        print("El tiro ", i+1, " sale; ", miDado.generarNumero())


if __name__ == '__main__':
    main()
