package ejercicioCRUD.core.autor;

import ejercicioCRUD.core.instituto.Instituto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Autor {
    
     //atrivtos de la clase autor

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //secuencias de la id de la tabla autor
    private Long id;
    private String name;
    private String lastname; 

    @ManyToOne
    private Autor autor;

}
