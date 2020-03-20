package com.marcos.redehotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.redehotel.domain.Hotel;

/*classe responsável pela camada de acesso a dados*/
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
