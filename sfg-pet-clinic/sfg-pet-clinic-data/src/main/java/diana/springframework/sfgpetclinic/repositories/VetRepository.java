package diana.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import diana.springframework.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
