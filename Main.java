import java.util.*;

public class Main {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        List <String> lista_especial = new ArrayList <String>();
        List<Integer> suma = new ArrayList <Integer> ();
        int tam = 0;
        int nummes = 0;
        int contador = 0;
        Scanner input = new Scanner (System.in);
        boolean condicion1 = true;
        boolean condicion2 = true;
        int mesa = 10;
        int contfin = 0;
        ArrayList<ArrayList<mesa>> tables = new ArrayList<ArrayList<mesa>>();
    
        while (condicion1){
            System.out.print ("Ingrese primero el tamano de la mesa y luego la cantidad de mesas de ese tamano\n");
            System.out.print("Cual es el tamano de las mesas que tienen disponibles (personas que caben)\n");
            nummes = input.nextInt();
            System.out.print("Cuantas mesas de ese tamano tiene?\n ");
            tam = input.nextInt();
            suma.add(tam);
            
            int sum = 0;
            for (int i: suma){
                sum += i;
            }
            System.out.print("La suma total es: " + sum + "\n");
    
            if (sum == mesa){
                condicion1 = false;
            }
            else if (sum > mesa){
                System.out.print("\n \n El numero de mesas es mayor al ingresado\n \n");
                System.out.print("Porfavor ingrese el tamano y la cantidad de nuevo\n");
                  suma.removeAll(suma);
                  sum = 0;
                continue;
            }
            ArrayList <mesa> contenedorDeMesaTemp = new ArrayList<mesa>();
            for (int i = 0; i <= tam-1; i++){
              mesa abc = new mesa(nummes);
              contenedorDeMesaTemp.add(abc);
            }
            tables.add(contenedorDeMesaTemp);
            System.out.println(tables);
          }


        while (condicion2){
          System.out.print("1. Agregar lista espera\n2. Agregar lista de espera especial\n3. Ver listas\n");
          int dec1 = input.nextInt();
          
    
          switch (dec1){
            case 1: 
            do {
                System.out.println("La lista de espera es" + list);
                System.out.println("Agregar cliente? (y/n)");
                if (input.next().startsWith("y")) {
                    System.out.println("Ingrese el nombre del cliente : ");
                    list.add(input.next());
                } else {
                    break;
                }
            } while (true);
            System.out.println("Clientes en cola " + list);
            break;
    
            case 2:
            do {
                System.out.println("La lista de espera especial es" + lista_especial);
                System.out.println("Agregar cliente? (y/n)");
                if (input.next().startsWith("y")) {
                    System.out.println("Ingrese el nombre del cliente : ");
                    lista_especial.add(input.next());
                } else {
                    break;
                }
            } while (true);
            System.out.println("Clientes en espera especial " + lista_especial);
            break;
            case 3:
            System.out.println("___________________________");
            System.out.println("Espera: " +list + "\n");
            System.out.println("___________________________");
            System.out.println("Espera especial: " +lista_especial + "\n");
            break;
    
            case 4:
            break;
            }   
         }
    }
  }
