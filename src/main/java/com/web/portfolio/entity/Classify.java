package com.web.portfolio.entity;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classify implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "classify")
    @JsonIgnoreProperties("classify")
    private Set<TStock> tStock;

    public Classify() {
    }

    public Classify(String name) {
	this.name = name;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Set<TStock> gettStock() {
	return tStock;
    }

    public void settStock(Set<TStock> tStock) {
	this.tStock = tStock;
    }

    @Override
    public String toString() {
	return "Classify{" + "id=" + id + ", name=" + name + '}';
    }

}
