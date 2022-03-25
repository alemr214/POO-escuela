class Empleados():
    __nombreEmpleados = []
    __sueldoEmpleados = []

    def registrarEmpleado(self, nombre, sueldo):
        self.__nombreEmpleados.append(nombre)
        self.__sueldoEmpleados.append(sueldo)

    def verificarRegistrosEmpleados(self):
        for i in range(len(self.__nombreEmpleados)):
            print("Empleado #", i+1)
            print(
                "Nombre: ", self.__nombreEmpleados[i], " sueldo: ", self.__sueldoEmpleados[i])

    def verificarCantidadEmpleados(self):
        print(len("Cantidad de empleados: ", self.__nombreEmpleados))


def main():
    print("---Programa para registro y verificacion de empleados---")
    bandera = True
    misEmpleados = Empleados()
    while bandera:
        opcion = int(input("""
    Ingresa el numero de una de las siguientes opciones
    1-Dar de alta un empleado
    2-Consulta la informacion de todos tus empleados
    3-Consulta cuantos empleados estan registrados
    4-Salir de sistema
    : """))
        if opcion == 1:
            nombre = input("Ingresa el nombre del empleado: ")
            sueldo = input("Ingresa el sueldo del empleado: ")
            misEmpleados.registrarEmpleado(nombre, sueldo)
        elif opcion == 2:
            misEmpleados.verificarRegistrosEmpleados()
        elif opcion == 3:
            misEmpleados.verificarCantidadEmpleados()
        elif opcion == 4:
            break
        else:
            print("Opcion incorrecta")
            break


if __name__ == '__main__':
    main()
