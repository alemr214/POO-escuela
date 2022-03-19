class Foco():
    __marca = None
    __numeroLeds = None
    __precio = None

    def getMarca(self):
        return self.__marca

    def getNumeroLeds(self):
        return self.__numeroLeds

    def getPrecio(self):
        return self.__precio

    def setMarca(self, marca):
        self.__marca = marca

    def setNumeroLeds(self, numeroLeds):
        self.__numeroLeds = numeroLeds

    def setPrecio(self, precio):
        self.__precio = precio
