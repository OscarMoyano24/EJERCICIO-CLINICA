//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
      Scanner teclado = new Scanner(System.in);
      CLINICA paciente1 = new CLINICA();

      paciente1.setNombre("Andres");
      paciente1.setEdad(28);
      paciente1.setPeso(65);
      paciente1.setPresionArterial(120);
      paciente1.setEstable(false);

      System.out.println(paciente1.toString());

      int opcion;

      do {
            System.out.println("\n MENU ");
            System.out.println("1. Crear paciente");
            System.out.println("2. Buscar paciente");
            System.out.println("3. Modificar edad");
            System.out.println("4. Modificar peso");
            System.out.println("5. Modificar presion");
            System.out.println("6. Cambiar estado(estable/inestable");
            System.out.println("7. Mostrar informacion");
            System.out.println("8. Salir");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();
      }


}
