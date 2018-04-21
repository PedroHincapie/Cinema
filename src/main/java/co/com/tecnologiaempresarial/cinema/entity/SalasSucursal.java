package co.com.tecnologiaempresarial.cinema.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salas_sucursal")
public class SalasSucursal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_sala")
	private Long id_sala;
	
	@Column(name = "id_sucursal")	
	private Long id_sucursal;
	
	@Column(name = "id_tipo_sala")
	private Long id_tipo_sala;

	@Column(name = "num_fila")	
	private int num_fila;
	
	@Column(name = "num_silla_fila")
	private int num_silla_fila;

	public Long getId_sala() {
		return id_sala;
	}

	public void setId_sala(Long id_sala) {
		this.id_sala = id_sala;
	}

	public Long getId_sucursal() {
		return id_sucursal;
	}

	public void setId_sucursal(Long id_sucursal) {
		this.id_sucursal = id_sucursal;
	}

	public Long getId_tipo_sala() {
		return id_tipo_sala;
	}

	public void setId_tipo_sala(Long id_tipo_sala) {
		this.id_tipo_sala = id_tipo_sala;
	}

	public int getNum_fila() {
		return num_fila;
	}

	public void setNum_fila(int num_fila) {
		this.num_fila = num_fila;
	}

	public int getNum_silla_fila() {
		return num_silla_fila;
	}

	public void setNum_silla_fila(int num_silla_fila) {
		this.num_silla_fila = num_silla_fila;
	}
	
}
