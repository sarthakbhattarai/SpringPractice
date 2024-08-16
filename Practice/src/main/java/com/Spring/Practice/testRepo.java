package com.Spring.Practice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface testRepo extends JpaRepository<test , Integer> {

    List<test> findByName(String name);

    @Modifying
    @Transactional
    @Query("Delete from test s where s.name=?1")
    void deleteByName(String name);



}
