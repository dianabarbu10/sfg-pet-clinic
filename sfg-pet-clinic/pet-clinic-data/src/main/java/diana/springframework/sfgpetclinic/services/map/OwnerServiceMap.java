package diana.springframework.sfgpetclinic.services.map;

import java.util.Set;

import diana.springframework.sfgpetclinic.model.Owner;
import diana.springframework.sfgpetclinic.services.CRUDService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>
		implements
			CRUDService<Owner, Long> {
	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner owner) {
		return super.save(owner.getId(), owner);
	}
	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
