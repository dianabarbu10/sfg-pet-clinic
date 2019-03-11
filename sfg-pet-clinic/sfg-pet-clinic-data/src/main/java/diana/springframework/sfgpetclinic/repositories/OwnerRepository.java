package diana.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import diana.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
