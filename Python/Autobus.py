class Autobus():
    __kilometraje = None
    __color = None

    def getKilometraje(self):
        return self.__kilometraje

    def getColor(self):
        return self.__color

    def setKilometraje(self, kilometraje):
        self.__kilometraje = kilometraje

    def setColor(self, color):
        self.__color = color


def main():
    miAutobus = Autobus()
    print("El kilometraje es: ", miAutobus.getKilometraje())
    print("El color es: ")
