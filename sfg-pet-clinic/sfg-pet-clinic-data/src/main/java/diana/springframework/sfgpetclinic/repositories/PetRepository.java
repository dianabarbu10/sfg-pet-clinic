package diana.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import diana.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
