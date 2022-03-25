from Dado import *


class Jugador():
    __nombre = ''
    __jugadasGanadas = 0
    __jugadasPerdidas = 0
    __jugadasEmpatadas = 0

    def __init__(self, nombre):
        self.__nombre = nombre

    def incrementarJugadasGanadas(self):
        self.__jugadasGanadas += 1

    def incrementarJugadasPerdidas(self):
        self.__jugadasPerdidas += 1

    def incrementarJugadasEmpatadas(self):
        self.__jugadasEmpatadas += 1

    def lanzarDado(dado):
        dado = Dado()
        return dado.generarNumero()

    def getNombre(self):
        return self.__nombre

    def getJugadasGanadas(self):
        return self.__jugadasGanadas

    def getJugadasPerdidas(self):
        return self.__jugadasPerdidas

    def getJugadasEmpatadas(self):
        return self.__jugadasEmpatadas

    def determinarGanador(self, jugador, nombre):
        jugador = Jugador(nombre)
        if self.__jugadasGanadas > jugador.getJugadasGanadas():
            return self.__nombre
        elif self.__jugadasGanadas < jugador.getJugadasGanadas():
            return jugador.getNombre()
        else:
            return None


def main():
    nombreJugador1 = input("Ingrese el nombre del jugador1: ").replace(
        ' ', '').capitalize()
    nombreJugador2 = input("Ingrese el nombre del jugador2: ").replace(
        ' ', '').capitalize()
    jugador1 = Jugador(nombreJugador1)
    jugador2 = Jugador(nombreJugador2)
    dado = Dado()
    valorJugador1 = 0
    valorJugador2 = 0
    for i in range(5):
        valorJugador1 = jugador1.lanzarDado()
        valorJugador2 = jugador2.lanzarDado()
        if valorJugador1 > valorJugador2:
            jugador1.incrementarJugadasGanadas()
            jugador2.incrementarJugadasPerdidas()
        elif valorJugador1 < valorJugador2:
            jugador1.incrementarJugadasPerdidas()
            jugador2.incrementarJugadasGanadas()
        else:
            jugador1.incrementarJugadasEmpatadas()
            jugador2.incrementarJugadasEmpatadas()
    print("Estadisticas de: ", jugador1.getNombre(), "\nJugadas ganadas: ", jugador1.getJugadasGanadas(
    ), "\nJugadas perdidas: ", jugador1.getJugadasPerdidas(), "\nJugadas empatadas: ", jugador1.getJugadasEmpatadas())
    print("Estadisticas de: ", jugador2.getNombre(), "\nJugadas ganadas: ", jugador2.getJugadasGanadas(
    ), "\nJugadas perdidas: ", jugador2.getJugadasPerdidas(), "\nJugadas empatadas: ", jugador2.getJugadasEmpatadas())
    print(jugador1.determinarGanador(jugador2, nombreJugador2), " Es el ganador")


if __name__ == '__main__':
    main()
