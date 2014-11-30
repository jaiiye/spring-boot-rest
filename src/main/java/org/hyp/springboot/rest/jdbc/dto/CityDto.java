package org.hyp.springboot.rest.jdbc.dto;

import java.io.Serializable;

/**
 * City data transfer object.
 */
public class CityDto implements Serializable {

    private String name;
    private String country;
    private String temperature;

    public void setName(String name) {
        this.name = name;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return this.name;
    }

    public String getTemperature() {
        return this.temperature;
    }

    public String getCountry() {
        return this.country;
    }


    @Override
    public String toString() {
        return getName() + "," + getTemperature() + "," + getCountry();
    }
}