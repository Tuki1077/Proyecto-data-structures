# Proyecto Data structures
## *FLASH WAIT*
### Flash Wait es un sistema para cualquier tipo de restaurante que cuente con mesas y una lista de espera. Este sistema ayudará a gestionar, organizar y administrar la lista de espera de los restaurantes donde sea implementado. 
Las funciones que este programa ofrece son: 
  - Pregunta por cuantos clientes quiere ingresar y los ingresa a la lista por prioridad (tamaño de la party)
    - Agrega al cliente con su party (# de personas del grupo)
  - Ver lista de espera
    - Imprime la lista de espera por orden de prioridad 
  - Asignar mesas a los clientes dentro de la lista de espera
    - Asigna la mesa correspodiente al cliente conforme el tamaño del grupo
  - Ver disponibilidad de las mesas
    - Imprime las mesas
      - Si estan disponible: imprime true en disponibilidad
      - Si no estan disponibles: 
        - imprime false en disponibilidad 
        - imprime que no hay mesa disponible para los clientes que quiere agregar
        - imprime que no hay mesas porque no se han creado mesas (en caso que no haya agregado las mesas anteriormente)
  - Vaciar mesa
    - Pregunta cual mesa quiere vaciar por index en la lista y elimina al cliente de esa mesa
      - Pone la mesa disponible
  
