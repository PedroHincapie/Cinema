package co.com.tecnologiaempresarial.cinema.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ciudades")
public class Ciudades implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_ciudad")
	private int id_ciudad;

	@Column(name="nom_ciudad")
	private String nom_ciudad;

	public int getId_ciudad() {
		return id_ciudad;
	}

	public void setId_ciudad(int id_ciudad) {
		this.id_ciudad = id_ciudad;
	}

	public String getNom_ciudad() {
		return nom_ciudad;
	}

	public void setNom_ciudad(String nom_ciudad) {
		this.nom_ciudad = nom_ciudad;
	}
	
}
