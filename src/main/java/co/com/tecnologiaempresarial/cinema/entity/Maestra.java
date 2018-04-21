package co.com.tecnologiaempresarial.cinema.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "config_cinema")
public class Maestra implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Maestra(Long id_config, String clave, String valor) {
		super();
		this.id_config = id_config;
		this.clave = clave;
		this.valor = valor;
	}

	public Maestra() {
		super();		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_config")
	private Long id_config;
	
	@Column(name = "clave")	
	private String clave;
	
	@Column(name = "valor")
	private String valor;

	public Long getId_config() {
		return id_config;
	}

	public void setId_config(Long id_config) {
		this.id_config = id_config;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
