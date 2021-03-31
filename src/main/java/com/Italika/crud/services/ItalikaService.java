package com.Italika.crud.services;

import com.Italika.crud.entity.Italika;
import com.Italika.crud.repository.ItalikaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItalikaService {

    @Autowired
    ItalikaRepository ir;

    public List<Italika> lista(){
        return ir.listaProcedure();
    }
    
    // public Optional<Italika> getById(int id){
    //     return ir.listbyidProcedure(id);
    // }
    
    // public Optional<Italika> getBySku(String datasku){
    //     return ir.listbySkuProcedure(datasku);
    // }
    
    // public Optional<Italika> getByModelo(String data){
    //     return ir.listbyModeloProcedure(data);
    // }
    
//     public void saveProcedure(Italika data){
//        ir.saveProcedure(data.getSku(), data.getFert(), data.getModelo(), data.getTipo(), data.getNo_serie(), data.getFecha() );
//    }
//     
//     
//    public void deleteProcedure(int id){
//        ir.deleteProcedure(id);
//    }





}