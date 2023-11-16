package ejercicioCRUD.core.autor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface AutorRepository extends CrudRepository<Autor, Long>{
    List<Autor> findAll();
}