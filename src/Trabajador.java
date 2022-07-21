public class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Trabajador{" +
                "edad=" + getEdad() +
                ", nombre='" + getNombre() + '\'' +
                ", telefono=" + getTelefono() +
                ", salario=" + getSalario() +
                '}';
    }

}
