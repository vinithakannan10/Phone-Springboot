package com.laptop.vaio.Repository;

import com.laptop.vaio.DTO.VaioDTO;
import com.laptop.vaio.Entity.Vaio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaioRepository extends JpaRepository <Vaio,Integer> {
}
