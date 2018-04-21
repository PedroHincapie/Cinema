package co.com.tecnologiaempresarial.cinema.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipos_salas")
public class TipoSalas implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tipo_sala")
	private Long id_tipo_sala;
	
	@Column(name = "tipo_sala")
	private String tipo_sala;

	public Long getId_tipo_sala() {
		return id_tipo_sala;
	}

	public void setId_tipo_sala(Long id_tipo_sala) {
		this.id_tipo_sala = id_tipo_sala;
	}

	public String getTipo_sala() {
		return tipo_sala;
	}

	public void setTipo_sala(String tipo_sala) {
		this.tipo_sala = tipo_sala;
	} 	

}
