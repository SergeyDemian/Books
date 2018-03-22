package main.java.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Model implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (
			strategy = GenerationType.AUTO
			)
	@Column (
			name = "ID",
			unique = true
			)
	private Long id;

	public Model() {
		super();
	}

	public Model(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
