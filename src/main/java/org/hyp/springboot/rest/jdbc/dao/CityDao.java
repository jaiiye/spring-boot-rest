package org.hyp.springboot.rest.jdbc.dao;

import org.hyp.springboot.rest.jpa.domain.City;
import org.hyp.springboot.rest.jdbc.domain.CityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CityDao extends BaseDao<City> {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public City getByNameAndCountry(String name, String country) {
        City city;
        city = jdbcTemplate.queryForObject(sql, new Object[]{name, country}, getBeanPropertyRowMapper());
        return city;
    }
    public CityDto getCityDtoByNameAndCountry(String name, String country) {
        CityDto city;
        city = jdbcTemplate.queryForObject(sql, new Object[]{name, country}, new BeanPropertyRowMapper<CityDto>(CityDto.class));
        return city;
    }
    String sql = "select id, country, map, name, state from city where upper(name)=upper(?) and upper(country)=upper(?)";
    BeanPropertyRowMapper<City> beanPropertyRowMapper = new BeanPropertyRowMapper<City>(City.class);
}
