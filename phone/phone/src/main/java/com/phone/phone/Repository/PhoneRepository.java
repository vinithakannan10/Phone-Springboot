package com.phone.phone.Repository;

import com.phone.phone.Entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PhoneRepository extends JpaRepository<Phone,Integer> {


     // queries

     //getBy
   //  @Query(value = "select * from phone where phone_name =:phoneName", nativeQuery = true)
    // Optional<Phone> findByPhoneName(String phoneName);

     //getBy
     @Query(value = "select * from phone where price =:price", nativeQuery = true)
     Optional<Phone> findByPrice(Integer price);


     //getAll

     @Query(value = "select * from phone where price =:price",nativeQuery = true)
     List<Phone> findByPrice();

     //deleteBy
     @Query(value = "select * from phone where id =:id",nativeQuery = true)
     String deleteByid(Integer id);

     // new queries

//     @Query(value = "select * from phone where phone_name like %:phoneName%",nativeQuery = true)
//     List<Phone> findAll(String phoneName);

     @Query(value = "select * from phone where phone_Name like %:phoneName%",nativeQuery = true)
     List<Phone>findAll(String phoneName);
}
