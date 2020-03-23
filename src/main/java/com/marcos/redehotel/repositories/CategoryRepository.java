package com.marcos.redehotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.redehotel.domain.Category;

/*classe responsável pela camada de acesso a dados*/
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
