package ejercicioCRUD.core.autor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/autor")
@CrossOrigin({"*"})
public class AutorController {

    @Autowired
   AutorService service;

    //Metodo Leer
    @GetMapping("/{id}/")
    public Autor findById( @PathVariable long id ){
        return service.findById(id);
    }

    //Metodo Select All
    @GetMapping("/")
    public List<Autor> findAll() {
        return service.findAll();
    }

    //Metodo Crear
    @PostMapping("/")
    public Autor save( @RequestBody Autor entitiy ){
        return service.save(entitiy);
    }
    
    //Metodo Actualizar
    @PutMapping("/")
    public Autor update ( @RequestBody Autor entity){
        return service.save(entity);
    }

    //Metodo Eliminar
    @DeleteMapping("/{id}/")
    public void deleteById( @PathVariable long id ){
        service.deleteById(id);
    }

     

}