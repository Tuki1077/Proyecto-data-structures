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
