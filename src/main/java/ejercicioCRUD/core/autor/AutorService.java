package ejercicioCRUD.core.autor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class AutorService {
    @Autowired
    AutorRepository repository;
    
    //Metodo Guardar
    public Autor save( Autor entity ){
        return repository.save(entity);
    }
    
    //Metodo Eliminar
    public void deleteById( Long id ){
        repository.deleteById(id);
    }
    
    //Metodo Leer
    public Autor findById(Long id){
        return repository.findById(id).orElse(null);
    }
    
    //Metodo Select All
    public List<Autor> findAll(){
        return repository.findAll();
    }
    
}