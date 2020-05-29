package com.delta.delta.dao;

import com.delta.delta.bean.Aparelho;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AparelhoDAO extends CrudRepository<Aparelho, Long> {
}