package diana.springframework.sfgpetclinic.model;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Owner extends Person {
	private Set<Pet> pets;
}
