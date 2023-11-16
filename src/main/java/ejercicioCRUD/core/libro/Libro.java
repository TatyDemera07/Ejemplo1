package ejercicioCRUD.core.libro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Libro {
    
    //atrivtos de la clase Libro

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //secuencias de la id de la tabla libro
    private Long id;
    private String name;
    private String address; 
}
