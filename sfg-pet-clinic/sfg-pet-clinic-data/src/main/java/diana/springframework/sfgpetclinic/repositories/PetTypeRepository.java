package diana.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import diana.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
