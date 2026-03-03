public class CLINICA {
    // ATRIBUTOS

    private String  nombre;
    private int  edad;
    private double peso;
    private double presionArterial;
    private boolean estable;

    //CONSTRUCTOR VACIO//

    public CLINICA() {
    }
    // CONSTRUCTOR CONN PARAMETROS//

    public CLINICA(String nombre, int edad, double peso, double presionArterial, boolean estable) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.presionArterial = presionArterial;
        this.estable = estable;
    }

    // GETTER-SETTER//


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(double presionArterial) {
        this.presionArterial = presionArterial;
    }

    public boolean isEstable() {
        return estable;
    }

    public void setEstable(boolean estable) {
        this.estable = estable;
    }

    //TOSTRING//


    @Override
    public String toString() {
        return "CLINICA{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", presionArterial=" + presionArterial +
                ", estable=" + estable +
                '}';
    }


    //METODO CUMPLIR AÑOS//
    public int cumplirAños(){
        this.edad +=1;
        System.out.println(" la persona ha cumplido un año mas");
        return this.edad;
    }
     //METODO AUMENTAR PESO//

     public double aumentarPeso(double cantidad){
        this.peso += cantidad;
         System.out.println("la persona aumento de peso");
         return this.peso;
     }
    //METODO DISMINUIR PESO//
     public double disminuirPeso(double cantidad){
        this.peso -=cantidad;
         System.out.println("la persona disminuyo de peso");
         return this.peso;
     }

     //METODO SUBIR PRESION//

    public double  subirPresion(double valor){
        this.presionArterial += valor;
        System.out.println("la persona subio de presion arterial");
        return this.presionArterial;
    }

    //METODO BAJAR PRESION//

    public double bajarPresion(double valor){
        this.presionArterial -= valor;
        System.out.println("la persona tiene la presion arterial baja");
        return this.presionArterial;
    }

    //METODO EMPEORAR ESTADO//

    public void empeorarEstado(){
        this.estable = false;

        System.out.println(" l persona empeoro su estado");
    }

    //METODO MEJORAR ESTADO//

    public void mejorarEstado(){
        this.estable = true;
        System.out.println("la persona mejoro su estado");
    }

    //METODO HISTORIAL CLINICO//

    public void mostrarHistorialClinica(){
        System.out.println(this.toString());
    }







}
