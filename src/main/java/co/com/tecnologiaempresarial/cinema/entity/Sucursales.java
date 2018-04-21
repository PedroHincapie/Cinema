package co.com.tecnologiaempresarial.cinema.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sucursales")
public class Sucursales implements Serializable{

	private static final long serialVersionUID = 1L;

	public Sucursales() {
		super();	
	}

	public Sucursales(Long id_sucursal, String nom_sucursa, String dir_sucursal, String admin_sucursal,
			Long id_ciudad) {
		super();
		this.id_sucursal = id_sucursal;
		this.nom_sucursa = nom_sucursa;
		this.dir_sucursal = dir_sucursal;
		this.admin_sucursal = admin_sucursal;
		this.id_ciudad = id_ciudad;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_sucursal")
	private Long id_sucursal;

	@Column(name = "nom_sucursa")
	private String nom_sucursa;

	@Column(name = "dir_sucursal")
	private String dir_sucursal;

	@Column(name = "admin_sucursal")
	private String admin_sucursal;

	@Column(name = "id_ciudad")
	private Long id_ciudad;

	public Long getId_sucursal() {
		return id_sucursal;
	}

	public void setId_sucursal(Long id_sucursal) {
		this.id_sucursal = id_sucursal;
	}

	public String getNom_sucursa() {
		return nom_sucursa;
	}

	public void setNom_sucursa(String nom_sucursa) {
		this.nom_sucursa = nom_sucursa;
	}

	public String getDir_sucursal() {
		return dir_sucursal;
	}

	public void setDir_sucursal(String dir_sucursal) {
		this.dir_sucursal = dir_sucursal;
	}

	public String getAdmin_sucursal() {
		return admin_sucursal;
	}

	public void setAdmin_sucursal(String admin_sucursal) {
		this.admin_sucursal = admin_sucursal;
	}

	public Long getId_ciudad() {
		return id_ciudad;
	}

	public void setId_ciudad(Long id_ciudad) {
		this.id_ciudad = id_ciudad;
	}





}
