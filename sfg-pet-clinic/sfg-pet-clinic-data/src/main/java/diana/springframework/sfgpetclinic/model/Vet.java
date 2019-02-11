package diana.springframework.sfgpetclinic.model;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vet extends Person {
	private Set<Speciality> specialities;
}
