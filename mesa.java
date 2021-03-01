class mesa {
    client clienteAsignado; //cliente en la mesa
    int cantidad; //cantidad de sillas en la mesa
    boolean disponibilidad; //Si mesa esta ocupada o no
    
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
    
    //retirar al cliente y desocupar la mesa
    public void retirarCliente(){
        this.clienteAsignado = null;
        this.disponibilidad  = true;
    }
    
     public int verCantidad(){
        return cantidad;
    }
    
    //revisar si la mesa esta disponible
    public boolean esDisponible() {
        return disponibilidad;
    }
    public void removeCliente(){
        this.clienteAsignado = null;
        this.disponibilidad = true;
    }
    
    @Override 
    public String toString() {
        if(disponibilidad != true){
            return "Mesa de " + cantidad + " disponible: "+ disponibilidad + " cliente: " + clienteAsignado.toString();
        }
        else{
            return "Mesa de " + cantidad + " disponible: "+ disponibilidad;
        }
        
    }
}
