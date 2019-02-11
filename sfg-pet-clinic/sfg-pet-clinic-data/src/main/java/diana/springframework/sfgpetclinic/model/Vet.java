package diana.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vet extends Person {
	private Set<Specialty> specialties;
}
