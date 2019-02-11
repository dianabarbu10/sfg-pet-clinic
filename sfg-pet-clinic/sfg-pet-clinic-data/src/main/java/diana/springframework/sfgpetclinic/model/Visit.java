package diana.springframework.sfgpetclinic.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Visit extends BaseEntity {

	private LocalDate date;
	private String description;
	private Pet pet;
}
