import java.util.*;

public class Main 
{ 
	public static void main(String[] args) {
		PriorityQueueClients queue = new PriorityQueueClients();
		ArrayList<mesa> mesas = new ArrayList<>();
		Scanner input = new Scanner (System.in);
		Scanner inputS= new Scanner (System.in);
		boolean condicion = true;
        String nombreRestaurante;
        
        System.out.print(" \n ---------------------------  ");
        System.out.print("\n|                           |");
        System.out.print("\n|  Bienvenido a FLASH WAIT! | \n");
        System.out.print("|            ⏱️ ️             |");
        System.out.print("\n|                           |");
        System.out.print(" \n ---------------------------  \n");
        System.out.print("   🪑 ┬─┬ 🪑      🪑 ┬─┬ 🪑\n");

        System.out.print ("\n Ingrese el nombre de su restaurante: \n");
        System.out.print ("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ \n");
		nombreRestaurante = inputS.nextLine();
		System.out.print("\n  ***Porfavor ingrese sus mesas primero***!   ");

		while (condicion){
			System.out.print("\n\n");
			System.out.print("         *** " + nombreRestaurante + " ***\n");
			System.out.print("__________________________________________");
      		System.out.print("\n\n\n");

			System.out.print("\n      1. Agregar mesas ➕\n      2. Agregar clientes a la queue ➕\n      3. Ver queue 👥\n      4. Asignar mesa a cliente 🪑\n      5. Ver disponibilidad 👁️‍\n      6. Remover cliente de mesa ❌\n      7. Salir ➡️\n \n \n");
			System.out.print("__________________________________________\n");
			System.out.print("\n Ingrese la opcion del menu: ");
			int dec = input.nextInt();
			
			switch(dec){
				case 1:

					System.out.print ("Ingrese cuantas mesas tiene su restaurante: 🪑 ┬─┬ 🪑 \n");
					int m = input.nextInt();
					int contador = 0;
					for (int j = 1; j < m+1; j++){
						System.out.print ("Cuantas asientos tiene la mesa numero: " + j + "? 🪑\n");
						int cantidad = input.nextInt();
						mesa table = new mesa (cantidad);
						contador = contador + 1;
						mesas.add(table);
						System.out.print ("Mesa numero: " + contador + "," + cantidad + " de asientos\n");
					}
					break;

				case 2:
					System.out.print ("\nIngrese cuantos clientes desea agregar a la lista de espera: 👥 \n");
					int c = input.nextInt();
					for (int i = 0; i < c; i++){
						System.out.print ("\nIngrese un nombre para representar al grupo: \n");
						String cliente = inputS.next();
						System.out.print ("\n¿Cuántas personas vienen en el grupo? 👥 \n");
						int p = input.nextInt();
						client persona = new client (cliente,p);
						queue.add(persona);
						System.out.print (persona + "\n");
				}
					break;

				case 3:
					for(int i = 0; i < queue.size(); i++) {
						System.out.println(queue.get(i).toString());
					}

					break;

				case 4:
					System.out.print ("Cargando...\n");
					for (int i = 0; i < 101; i++) {
					if (i == 0)
						System.out.print("Proceso completado: " + i + " %" );
					try {
						Thread.sleep(20);
					} catch (Exception e) {
						System.out.println(e);
					}
					if (i > 9 && i <= 100) {
						System.out.print('\b');
						System.out.print('\b');
						System.out.print('\b');
						System.out.print('\b');
			
						System.out.print(i + " %");
					} else {
						System.out.print('\b');
						System.out.print('\b');
						System.out.print('\b');
			
						System.out.print(i + " %");
			
						}
					}	
					if (mesas.size() != 0){
                        for(int i = 0; i < mesas.size(); i++) {
                           if(mesas.get(i).esDisponible()){
                            mesa tempMesa = mesas.get(i);
                            int cantidad = tempMesa.verCantidad();
                            client tempclient = queue.remove(cantidad);
                            System.out.print ("\n" +tempclient + "\n");
                            if(tempclient != null){
                                tempMesa.assignarClient(tempclient);
                                     }
                             }
                    }
                    System.out.print ("\nClientes agregados a mesas!\n\n");
                    }
                    else if (mesas.size() == 0){
                        System.out.print("\nNo se encuentran mesas, porfavor ingrese las mesas primero! ");
                    }
					if(queue.size() != 0){
						System.out.println("No hay mesas disponibles para los siguientes clientes:");
						   for(int i = 0; i < queue.size(); i++) {
									System.out.println(queue.get(i).toString());
							  } 
					}

					break;

				case 5:
					//ver mesas 
					for(int i = 0; i < mesas.size(); i++) {
						System.out.println(mesas.get(i).toString());
					}
					break;
				
				case 6:
					for (int i = 0; i<mesas.size(); i++){
					System.out.print (mesas.get(i).toString() + "\n");
					}
					System.out.print("Ingrese el numero de mesa en la lista que desea vaciar: ");
					System.out.print("\n\n");
					int vaciar = input.nextInt();
					mesas.get(vaciar - 1).removeCliente();
					for (int i = 0; i<mesas.size(); i++){
						System.out.print (mesas.get(i).toString() + "\n");
						}
					
					break;

				case 7:
					System.out.print ("Gracias por utilizar Flash Wait... Que tenga un buen dia!");
					System.exit(0);
			}
		}
	}
}
