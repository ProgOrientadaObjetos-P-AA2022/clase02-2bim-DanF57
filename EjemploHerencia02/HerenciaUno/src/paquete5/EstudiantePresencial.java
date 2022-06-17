package paquete5;

public class EstudiantePresencial extends Estudiante {

    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;

    public EstudiantePresencial(String nom, String ape, String id, int ed,
            int nCred, double coCred) {
        super(nom, ape, id, ed);
        numeroCreditos = nCred;
        costoCredito = coCred;
    }

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }

    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor) {
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial() {
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito() {
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial() {
        return matriculaPresencial;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s", super.toString());

        cadena = String.format("%s\n"
                + "Numero Creditos: %d\n"
                + "Costo de Creditos: %.2f\n"
                + "Total Matricula: %.2f\n",
                cadena,
                obtenerNumeroCreditos(),
                obtenerCostoCredito(),
                obtenerMatriculaPresencial());

        return cadena;
    }

}
