package com.zki.mission.data.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@JoinColumn(name="Service")
	@OneToOne(fetch = FetchType.EAGER)
	private Service service;
	
	@JoinColumn(name="Ressource")
	@OneToOne(fetch = FetchType.EAGER)
	private Ressource ressource;
	
	@Override
	public String toString() {
		return "[Mission [ressource : " + ressource.getCode() + "], "
						+ "[service :" + service.getCode() + "], "
						+ "[debut :" + debut + "], "
						+ "[fin :" + fin + "]]";
	}
}
