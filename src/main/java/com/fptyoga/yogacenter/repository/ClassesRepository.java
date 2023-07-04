package com.fptyoga.yogacenter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fptyoga.yogacenter.Entity.Class;

@Repository
public interface ClassesRepository extends JpaRepository<Class, Long>{

    @Query("SELECT  DISTINCT c.date FROM Class c")
    List<String> findDistinctDate();
}
