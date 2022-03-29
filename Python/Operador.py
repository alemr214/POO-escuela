class Operator():
    __operator1 = 0
    __operator2 = 0

    def __init__(self, operator1, operator2):
        self.__operator1 = operator1
        self.__operator2 = operator2

    def getOperator1(self):
        return self.__operator1

    def getOperator2(self):
        return self.__operator2

    def sum(self):
        return self.__operator1 + self.__operator2

    def rest(self):
        return self.__operator1 - self.__operator2

    def mult(self):
        return self.__operator1 * self.__operator2

    def div(self):
        return self.__operator1 / self.__operator2

    def pow(self):
        return self.__operator1 ** self.__operator2

    def mod(self):
        return self.__operator1 % self.__operator2


def main():
    number1 = int(input("Ingrese el primer numero: "))
    number2 = int(input("Ingrese el segundo numero: "))

    operator = Operator(number1, number2)
    print("La suma es: ", operator.sum())
    print("La resta es: ", operator.rest())
    print("La multiplicacion es: ", operator.mult())
    print("La division es: ", operator.div())
    print("La potencia es: ", operator.pow())
    print("El modulo es: ", operator.mod())


if __name__ == "__main__":
    main()
