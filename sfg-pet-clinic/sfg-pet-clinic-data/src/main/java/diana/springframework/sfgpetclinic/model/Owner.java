package diana.springframework.sfgpetclinic.model;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Owner extends Person {
	private String address;
	private String city;
	private String telephone;
	private Set<Pet> pets;
}
