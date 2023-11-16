package ejercicioCRUD.core.libro;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface LibroRepository extends CrudRepository<Libro, Long>{
    List<Libro> findAll();
}
