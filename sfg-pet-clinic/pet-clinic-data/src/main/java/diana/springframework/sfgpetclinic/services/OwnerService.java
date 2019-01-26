package diana.springframework.sfgpetclinic.services;

import diana.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CRUDService<Owner, Long> {

	Owner findByLastName();

}
