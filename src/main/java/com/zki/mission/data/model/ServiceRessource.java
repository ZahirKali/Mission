package com.zki.mission.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Table de correspendance Service/Ressource.
 * @author Zahir KALI (kalizahir@yahoo.fr)
 *
 */
@Getter
@Setter
@Entity
@Table(name = "ServiceRessource")
public class ServiceRessource {
	
	@Id
	@Column
	private int id;
	
	@JoinColumn(name="Service")
	@OneToOne(fetch = FetchType.EAGER)
	private Service service;
	
	@JoinColumn(name="Ressource")
	@OneToOne(fetch = FetchType.EAGER)
	private Ressource ressource;
}
