package org.hyp.springboot.rest.jdbc.dao;

import org.hyp.springboot.rest.jpa.domain.City;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

import java.lang.reflect.ParameterizedType;

/**
 * Generic BaseDao.
 */
public class BaseDao<T> {
    private Class<T> persistentClass;
    public BaseDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    protected RowMapper<T> getBeanPropertyRowMapper() {
        return new BeanPropertyRowMapper<T>(persistentClass);
    }
}
