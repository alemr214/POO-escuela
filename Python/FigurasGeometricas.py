from cmath import pi


class FigurasGeometricas():

    def calcularAreaRectangulo(base, altura):
        area = round(base * altura, 2)
        return area

    def calcularAreaTriangulo(base, altura):
        area = round((base * altura) / 2, 2)
        return area

    def calcularAreaTrapecio(baseMayor, baseMenor, altura):
        area = round(((baseMayor + baseMenor) * altura) / 2, 2)
        return area

    def calcularAreaCirculo(radio):
        area = round((pi * (radio ** 2)), 2)
        return area


def main():
    print("---Programa para calcular el area de figuras geometricas---")
    bandera = True
    while bandera:
        opcion = int(input("""Ingrese el numero de las siguientes opciones
    1-Rectangulo
    2-Triangulo
    3-Trapecio
    4-Circulo
    : """))

        if opcion == 1:
            base = float(input("Ingrese la medida de la base: "))
            altura = float(input("Ingrese la medida de la altura: "))
            area = FigurasGeometricas.calcularAreaRectangulo(base, altura)
            print("El area es: ", area, " unidades cuadradas")
        elif opcion == 2:
            base = float(input("Ingrese la medida de la base: "))
            altura = float(input("Ingrese la medida de la altura: "))
            area = FigurasGeometricas.calcularAreaTriangulo(base, altura)
            print("El area es: ", area, " unidades cuadradas")
        elif opcion == 3:
            baseMayor = float(input("Ingrese la medida de la base mayor: "))
            baseMenor = float(input("Ingrese la medida de la base menor: "))
            altura = float(input("Ingrese la medida de la altura: "))
            area = FigurasGeometricas.calcularAreaTrapecio(
                baseMayor, baseMenor, altura)
            print("El area es: ", area, " unidades cuadradas")
        elif opcion == 4:
            radio = float(input("Ingrese la medida del radio: "))
            area = FigurasGeometricas.calcularAreaCirculo(radio)
            print("El area es: ", area, " unidades cuadradas")
        else:
            print("Opcion incorrecta")
            break
        salida = input("Desea operar otra figura geometrica?: ").replace(
            " ", "").lower()
        if salida == "si":
            bandera = True
        elif salida == "no":
            bandera = False
        else:
            print("Opcion invalida")
            bandera = False


if __name__ == '__main__':
    main()
