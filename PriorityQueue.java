import java.util.*;

class PriorityQueueClients {
    ArrayList<client> queue;
    
    PriorityQueueClients(){
        queue = new ArrayList<>();
    }
    
    //Agregar cliente,
    //entre mas alta la prioridad mas rapido saldran de la queue
    public void add(client cliente) {
        //Si Queue esta vacia agregar al principio
        if (queue.size() == 0){
            queue.add(cliente);
        }
        //si cliente tiene la prioridad mas baja de todas agregar al final
        else if (cliente.verPrioridad() <= queue.get(queue.size()-1).verPrioridad()){
            queue.add(cliente);
        }
        //si cliente esta entre valores en la lista buscar.
            for(int i = 0; i < queue.size(); i++){
                if(queue.get(i).verPrioridad() < cliente.verPrioridad()){
                    queue.add(i,cliente);
                    break;
                }
            }
        }
        
    public client remove(int cantidad){
        for(int i = 0; i< queue.size(); i++){
            if(queue.get(i).verPrioridad()<=cantidad){
               return queue.remove(i);
            }
        }
        return null;
     }
     
     public int size(){
         return queue.size();
     }
     
     public client get(int index){
         return queue.get(index);
     }
}
