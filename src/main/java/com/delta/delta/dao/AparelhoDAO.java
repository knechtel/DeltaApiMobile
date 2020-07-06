package com.delta.delta.dao;

import com.delta.delta.bean.Aparelho;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AparelhoDAO extends CrudRepository<Aparelho, Long> {
    @Query("select a.idCliente,a.nome from Aparelho a")
    public List<Aparelho>findAllB();
}