package com.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * SpringBootDemo
 * <p>
 * Created by yang.tang on 2017/2/6 16:26.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    List<Person> findByName(String name);

    List<Person> findByAddress(String address);

    List<Person> findByNameAndAddress(String name, String address);

    @Query("select p from Person p where p.name=:name and p.address=:address")
    List<Person> withNameAndAddressQuery(
            @Param("name")String Name, @Param("address")String address);
}
