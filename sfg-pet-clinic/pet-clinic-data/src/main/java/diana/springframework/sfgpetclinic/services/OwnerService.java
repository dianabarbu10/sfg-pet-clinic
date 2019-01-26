package diana.springframework.sfgpetclinic.services;

import java.util.Set;

import diana.springframework.sfgpetclinic.model.Owner;

public interface OwnerService {

	Owner findByLastName();

	Owner findById();

	Owner save(Owner owner);

	Set<Owner> findAll();
}
