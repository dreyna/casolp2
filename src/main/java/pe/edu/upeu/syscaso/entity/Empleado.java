package pe.edu.upeu.syscaso.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "empleados")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombres", length = 45)
	private String nombres;
	
	@Column(name = "apellidos", length = 45)
	private String apellidos;
	
	@Column(name = "dni", length = 8)
	private String dni;
	
	@Column(name = "correo", length = 45)
	private String correo;
	
	@Column(name = "estado")
	private char estado;
	
	@OneToOne(mappedBy = "empleado")
	private Usuario usuario;
	
}
