package pe.edu.upeu.syscaso.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name = "accesos")
public class Acceso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "titulo", length = 100)
	private String titulo;
	@Column(name = "icono", length = 100)
	private String icono;
	@Column(name = "url", length = 100)
	private String url;
	@Column(name = "estado")
	private char estado;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
				name = "acceso_rol", 
				joinColumns = @JoinColumn(name="acceso_id", referencedColumnName = "id"),
				inverseJoinColumns = @JoinColumn(name="rol_id", referencedColumnName = "id")
			)
	private Set<Rol> roles;
	
	
	
	
}















