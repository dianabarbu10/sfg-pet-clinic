package diana.springframework.sfgpetclinic.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
	private PetType petType;
	private Owner owner;
	private LocalDate birthDay;
}
