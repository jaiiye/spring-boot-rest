package org.hyp.springboot.rest.jpa.service;

import org.hyp.springboot.rest.jpa.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class CityDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public City getByNameAndCountry(String name, String country) {
        return jdbcTemplate.queryForObject("select city0_.id as id1_0_, city0_.country as country2_0_, " +
                        "city0_.map as map3_0_, city0_.name as name4_0_, city0_.state as state5_0_ " +
                        "from city city0_ where upper(city0_.name)=upper(?) and upper(city0_.country)=upper(?)", new Object[]{name, country},
                new RowMapper<City>() {
                    @Override
                    public City mapRow(ResultSet rs, int rowNum) throws SQLException {
                        City city = new City();
                        city.setId(rs.getLong("id"));
                        city.setName(rs.getString("name"));
                        city.setCountry(rs.getString("country"));
                        return city;
                    }
                });
    }
}
