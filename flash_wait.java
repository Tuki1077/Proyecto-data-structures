import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner input = new Scanner (System.in);
    boolean condicion1 = true;

    

    System.out.print("\n \n Bienvenido a FLASH WAIT \n \n");
    
    System.out.print("Como se llama el Restaurante? \n");
    String rest = input.nextLine();
    System.out.print("\n Bienvenido " + rest + " a FLASH WAIT \n");

    while (condicion1 == true){
      System.out.print("\n Cuantas mesas se situan en " + rest + " actualmente? \n");
      int mesas = input.nextInt();
      System.out.print("\n Actualmente hay " + mesas + " mesas en " + rest + " correcto? \n");
      System.out.print(" 1) si \n 2) no \n");
      int dec1 = input.nextInt();

      switch (dec1){
        case 1: 
          System.out.print("\n Actualmente hay " + mesas + " mesas en " + rest + "\n");
          condicion1 = false;

        case 2:
          break;
      }
      

    }

  }
}
