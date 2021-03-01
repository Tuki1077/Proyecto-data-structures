class client {
    String nombre; //nombre del clinete
    int prioridad; //mas prioridad es mas importante. Esto representa el espacio en la mesa
    
    client (String nombre, int prioridad){
        this.nombre = nombre;
        this.prioridad = prioridad;
    }
    
    //ver prioridad del cliente
    public int verPrioridad(){
        return prioridad;
    }
    
    @Override
    public String toString() {
        return "👤 Nombre: " + nombre + " 👥 P: " + prioridad;
    }
}
