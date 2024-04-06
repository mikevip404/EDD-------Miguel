package Registro;

public class Persona 
{
    private String Nombre;
    private int Cedula;
    private String fechaNacimiento;


    public Persona(String Nombre, int Cedula, String fechaNacimiento) 
    {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return this.Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



    public void mostrarInformacion() 
    {
        System.out.println("Cédula: " + Cedula);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("-----------------------------");
    }

    public int calcularEdad() 
    {
        // Cálculo de la edad
        return 2024 - Integer.parseInt(fechaNacimiento.substring(6));
    }
}
