package diana.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import diana.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
