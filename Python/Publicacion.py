class Publicacion():
    _titulo = ""
    _precio = 0.0

    def __init__(self, titulo, precio):
        self.titulo = titulo
        self.precio = precio

    def getTitulo(self):
        return self.titulo

    def getPrecio(self):
        return self.precio

    def setTitulo(self, titulo):
        self.titulo = titulo

    def setPrecio(self, precio):
        self.precio = precio

    def __str__(self):
        return "Estado \n" + "Titulo: " + self.titulo + " Precio: " + str(self.precio)
