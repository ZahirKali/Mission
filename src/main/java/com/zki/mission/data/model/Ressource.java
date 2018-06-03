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

/**
 * Une ressource est un collaborateur, gérant ou toute personne impliquée dans
 * la structure.
 * 
 * @author Zahir KALI (kalizahir@yahoo.fr)
 *
 */
@Getter
@Setter
@Entity
@Table(name = "Ressource")
public class Ressource {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Code")
	private String code;

	@Column(name = "Nom")
	private String nom;

	@Column(name = "Prenom")
	private String prenom;

	@Column(name = "CheminPhoto")
	private String CheminPhoto;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "ressource")
	private List<Mission> missions;
	
	@Override
	public String toString() {
		return "[Ressource [code : " + code + "], [nom :" + nom + "],"
				+ " [prenom : " + prenom + "]]";
	}
}
