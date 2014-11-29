package org.hyp.springboot.jpa;

import org.hyp.springboot.ApplicationTests;
import org.hyp.springboot.rest.jpa.domain.City;
import org.hyp.springboot.rest.jpa.service.CityService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by huangyp on 2014/11/25.
 */
@ActiveProfiles("scratch")
public class CityServiceTests extends ApplicationTests {
    @Autowired
    CityService service;

    @Test
    public void getCity() {
        City city = service.getCity("Tokyo", "Japan");
        assertNotNull(city);

        assertEquals("Tokyo", city.getName());
    }
}
