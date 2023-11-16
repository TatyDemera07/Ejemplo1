package ejercicioCRUD.core.libro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class LibroService {
    @Autowired
    LibroRepository repository;
    
    public Libro save( Libro entity ){
        return repository.save(entity);
    }
    
    public void deleteById( Long id ){
        repository.deleteById(id);
    }
    
    public Libro findById(Long id){
        return repository.findById(id).orElse(null);
    }
    
    //Metodo select All
    public List<Libro> findAll(){
        return repository.findAll();
    }
    
}