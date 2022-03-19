class Automovil():
    __velocidad = None
    __velocidadMaxima = None

    def getVelocidad(self):
        return self.__velocidad

    def getVelocidadMaxima(self):
        return self.__velocidadMaxima

    def setVelocidad(self, velocidad):
        self.__velocidad = velocidad

    def setVelocidadMaxima(self, velocidadMaxima):
        self.__velocidadMaxima = velocidadMaxima

    def __init__(self):
        self.__velocidadMaxima = 90

    def determinaExcede(self):
        excede = True
        if self.__velocidad > self.__velocidadMaxima:
            excede = True
        else:
            excede = False
        return excede


def main():
    miAutomovil = Automovil()
    velocidad = float(input("Ingrese la velocidad a la que va el automovil: "))
    miAutomovil.setVelocidad(velocidad)
    excede = miAutomovil.determinaExcede()
    if excede == True:
        print("El auto excede la velocidad maxima de 90km/h")
    else:
        print("El auto no execede la velocidad maxima de 90km/h")


if __name__ == '__main__':
    main()
