class mesa {
    client clienteAsignado; //cliente en la mesa
    int cantidad; //cantidad de sillas en la mesa
    boolean disponibilidad; //Si mesa esta ocupada o no
    
    String si = "Si";
    String no = "No";


    mesa(int cantidad){
        this.cantidad = cantidad;
        this.disponibilidad = true;
        this.clienteAsignado = null;
    }
    
    //asignar cliente y ocupar la mesa
    public void assignarClient(client cliente){
        this.clienteAsignado = cliente;
        this.disponibilidad = false;
    }
    
     public int verCantidad(){
        return cantidad;
    }
    
    //revisar si la mesa esta disponible
    public boolean esDisponible() {
        return disponibilidad;
    }
    //retira el cliente y vacia la mesa
    public void removeCliente(){
        this.clienteAsignado = null;
        this.disponibilidad = true;
    }
    @Override 
    public String toString() {
        if(disponibilidad != true){
            return "Mesa de " + cantidad + " disponible?: "+ no + " ❌ . " + " Cliente: " +  clienteAsignado.toString();
        }
        else{
            return "Mesa de " + cantidad + "personas disponible?: "+ si + " ✅ . ";
        }
        
    }
}
