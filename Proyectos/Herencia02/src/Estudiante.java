public class Estudiante extends Persona {
    public String matricula;
    public String carrera;
    public int semestre;
    public int creditosCursando;
    public int horasCursando;

    public Estudiante(String nombre, int edad, Date fechaNacimiento, String direccion, String telefono,
            String matricula, String carrera, int semestre, int creditosCursando, int horasCursando) {
        super(nombre, edad, fechaNacimiento, direccion, telefono);
        this.matricula = matricula;
        this.carrera = carrera;
        this.semestre = semestre;
        this.creditosCursando = creditosCursando;
        this.horasCursando = horasCursando;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCreditosCursando() {
        return creditosCursando;
    }

    public void setCreditosCursando(int creditosCursando) {
        this.creditosCursando = creditosCursando;
    }

    public int getHorasCursando() {
        return horasCursando;
    }

    public void setHorasCursando(int horasCursando) {
        this.horasCursando = horasCursando;
    }

}
