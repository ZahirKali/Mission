package com.zki.mission.data.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Service")
public class Service {
	
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String code;
    
    @Column
    private String libelle;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "service")
    private List<Mission> missions;
    
	@Override
	public String toString() {
		return "[Service [code : " + code + "], [libelle :" + libelle + "]]";
	}
}
