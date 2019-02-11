package diana.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Specialty extends BaseEntity {
	private String description;

}
