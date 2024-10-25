package Tienda.demo.dao;

import Tienda.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoriaDao extends JpaRepository <Categoria,Long> {
    
}