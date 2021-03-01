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
public class mesa{
    int nopersonas;
    int conta;

    public mesa(int persona){
        this.nopersonas = persona;
    }
    
    @Override
    public String toString(){
        return "Mesa de " + nopersonas;
    }
}
