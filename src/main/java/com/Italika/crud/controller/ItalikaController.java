package com.Italika.crud.controller;

import com.Italika.crud.entity.Italika;
import com.Italika.crud.repository.ItalikaRepository;
import com.Italika.crud.services.ItalikaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ItalikaController {

    @Autowired
    ItalikaService is;

    @GetMapping()
    public ResponseEntity<List<Italika>> lista(){
        List<Italika> lista = is.lista();
        return new ResponseEntity(lista, HttpStatus.OK);
    }
    
    // @GetMapping("/{id}")
    // public ResponseEntity<Italika> listId(@PathVariable("id") int id){
    //     Optional<Italika> moto = is.getById(id);
    //     return new ResponseEntity(moto, HttpStatus.OK);
    // }
    
    // @GetMapping("/sku/{sku}")
    // public ResponseEntity<Italika> listSku(@PathVariable("sku") String data){
    //     Optional<Italika> moto = is.getBySku(data);
    //     return new ResponseEntity(moto, HttpStatus.OK);
    // }
    
    // @GetMapping("/modelo/{data}")
    // public ResponseEntity<Italika> listModelo(@PathVariable("databuscar") String data){
    //     Optional<Italika> moto = is.getByModelo(data);
    //     return new ResponseEntity(moto, HttpStatus.OK);
    // }
    
    
//     @PostMapping()
//    public ResponseEntity<?> save(@RequestBody Italika data){
//        is.saveProcedure(data);
//        return new ResponseEntity("Producto Guardado", HttpStatus.CREATED);
//    }
    
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> borrar(@PathVariable("id")int id){
//        is.deleteProcedure(id);
//        return new ResponseEntity("Producto Eliminado", HttpStatus.OK);
//    }
    
    
    


}