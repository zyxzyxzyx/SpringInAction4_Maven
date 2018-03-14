package com.hibernate4.repository;

import com.hibernate4.domain.Spitter;

import java.util.List;

/**
 * Created by yangjing on 2018/3/14
 */
public interface SpitterRepository {

    long count();

    Spitter save(Spitter spitter);

    Spitter findById(long id);

    Spitter findByUsername(String username);

    List findAll();

}
