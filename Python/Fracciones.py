class Fractions():
    __numerator = 0
    __denominator = 0

    def __init__(self, numerator, denominator):
        self.__numerator = numerator
        self.__denominator = denominator

    def getNumerator(self):
        return self.__numerator

    def getDenominator(self):
        return self.__denominator

    def sum(self, fraction):
        numerator = self.__numerator * fraction.__denominator + \
            self.__denominator * fraction.__numerator
        denominator = self.__denominator * fraction.__denominator
        return Fractions(numerator, denominator)


def main():
    f1 = Fractions(1, 2)
    f2 = Fractions(1, 3)

    s = f1.sum(f2)

    print(s.getNumerator(), s.getDenominator())


if __name__ == "__main__":
    main()
