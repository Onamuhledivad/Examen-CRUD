package com.Italika.crud.repository;

import com.Italika.crud.entity.Italika;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItalikaRepository extends JpaRepository<Italika, Integer> {

    @Query(value = "{call lista_productos()}", nativeQuery = true)
    List<Italika> listaProcedure();
    
    // @Query(value = "{call lista_by_id(:idata)}", nativeQuery = true)
    // Optional<Italika> listbyidProcedure(@Param("idata") int idata);
    
    // @Query(value = "{call lista_by_sku(:dataSKU)}", nativeQuery = true)
    // Optional<Italika> listbySkuProcedure(@Param("dataSKU") String dataSKU);
    
    
    // @Query(value = "{call lista_by_modelo(:databuscar)}", nativeQuery = true)
    // Optional<Italika> listbyModeloProcedure(@Param("databuscar") String databuscar);
   
//    @Query(value = "{call save_producto(:skuIn, :fertIn, :modeloIn, :tipoIn, :no_serieIn, :fechaIn)}", nativeQuery = true)
//    void saveProcedure(
//            @Param("skuIn")String skuIn,
//            @Param("fertIn")String fertIn,
//            @Param("modeloIn")String modeloIn,
//            @Param("tipoIn")String tipoIn,
//            @Param("no_serieIn")Long no_serieIn,
//            @Param("fechaIn")String fechaIn
//    );
//    
//    
//    @Query(value = "{call delete_procedure(:idata)}", nativeQuery = true)
//    void deleteProcedure(@Param("idata") int idata);

    
    
    
}