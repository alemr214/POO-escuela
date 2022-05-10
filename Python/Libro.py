from Python.Publicacion import Publicacion


class Libro(Publicacion):
    _numeroPaginas = 0

    def __init__(self, titulo, precio, numeroPaginas):
        super.__init__(titulo, precio)
        self.numeroPaginas = numeroPaginas

    def getNumeroPaginas(self):
        return self.numeroPaginas

    def setNumeroPaginas(self, numeroPaginas):
        self.numeroPaginas = numeroPaginas

    def __str__(self):
        return "Estado \n" + "Titulo: " + self.titulo + " Precio: " + str(self.precio) + " Numero de Paginas: " + str(self.numeroPaginas)
