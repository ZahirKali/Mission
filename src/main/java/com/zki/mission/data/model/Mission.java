package com.zki.mission.data.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

/**
 * Une mission impluque une ressource qui sera affectée à un service.
 * @author Zahir KALI (kalizahir@yahoo.fr)
 *
 */
@Getter
@Setter
@Entity
@Table(name = "Mission")
public class Mission {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Debut")
	private Date debut;
	
	@Column(name = "Fin")
	private Date fin;

	@Column(name = "Titre")
	private String titre;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Ressource")
	private Ressource ressource;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Service")
	private Service service;
	
	@Override
	public String toString() {
		return "[Mission [ressource : " + ressource.getCode() + "], "
						+ "[service :" + service.getCode() + "], "
						+ "[debut :" + debut + "], "
						+ "[fin :" + fin + "]]";
	}
}
