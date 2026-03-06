void main() {

      Scanner teclado = new Scanner(System.in);

      CLINICA paciente1 = new CLINICA("Andres",28,65,120,false);

      int opcion;

      System.out.println("Informacion inicial:");
      paciente1.mostrarHistorialClinica();

      do {3

            System.out.println("\nMENU");
            System.out.println("1. Crear paciente");
            System.out.println("2. Buscar paciente");
            System.out.println("3. Modificar edad");
            System.out.println("4. Modificar peso");
            System.out.println("5. Modificar presion");
            System.out.println("6. Cambiar estado");
            System.out.println("7. Mostrar informacion");
            System.out.println("8. Salir");
            System.out.print("Opcion: ");

            opcion = teclado.nextInt();

            if(opcion == 1){

                  teclado.nextLine();

                  System.out.print("Nombre: ");
                  paciente1.setNombre(teclado.nextLine());

                  System.out.print("Edad: ");
                  paciente1.setEdad(teclado.nextInt());

                  System.out.print("Peso: ");
                  paciente1.setPeso(teclado.nextDouble());

                  System.out.print("Presion arterial: ");
                  paciente1.setPresionArterial(teclado.nextDouble());

                  System.out.print("Estado (true=estable / false=inestable): ");
                  paciente1.setEstable(teclado.nextBoolean());

                  System.out.println("Paciente creado:");
                  paciente1.mostrarHistorialClinica();
            }

            else if(opcion == 2){
                  paciente1.mostrarHistorialClinica();
            }

            else if(opcion == 3){

                  System.out.println("Antes del cambio:");
                  paciente1.mostrarHistorialClinica();

                  paciente1.cumplirAños();

                  System.out.println("Despues del cambio:");
                  paciente1.mostrarHistorialClinica();
            }

            else if(opcion == 4){

                  System.out.print("Cantidad a aumentar peso: ");
                  double peso = teclado.nextDouble();

                  System.out.println("Antes del cambio:");
                  paciente1.mostrarHistorialClinica();

                  paciente1.aumentarPeso(peso);

                  System.out.println("Despues del cambio:");
                  paciente1.mostrarHistorialClinica();
            }

            else if(opcion == 5){

                  System.out.print("Valor a modificar presion: ");
                  double presion = teclado.nextDouble();

                  System.out.println("Antes del cambio:");
                  paciente1.mostrarHistorialClinica();

                  paciente1.subirPresion(presion);

                  System.out.println("Despues del cambio:");
                  paciente1.mostrarHistorialClinica();
            }

            else if(opcion == 6){

                  System.out.println("Antes del cambio:");
                  paciente1.mostrarHistorialClinica();

                  if(paciente1.isEstable()){
                        paciente1.empeorarEstado();
                  }else{
                        paciente1.mejorarEstado();
                  }

                  System.out.println("Despues del cambio:");
                  paciente1.mostrarHistorialClinica();
            }

            else if(opcion == 7){
                  paciente1.mostrarHistorialClinica();
            }

            else if(opcion == 8){
                  System.out.println("Saliendo...");
            }

            else{
                  System.out.println("Opcion invalida");
            }

      }while(opcion != 8);

}