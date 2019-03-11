package diana.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
	@Column(name = "name")
	private String name;
}
