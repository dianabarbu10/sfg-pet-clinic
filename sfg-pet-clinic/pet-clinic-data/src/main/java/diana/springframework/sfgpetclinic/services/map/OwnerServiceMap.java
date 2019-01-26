package diana.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import diana.springframework.sfgpetclinic.model.Owner;
import diana.springframework.sfgpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>
		implements
			OwnerService {
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
		return super.save(owner);
	}
	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	@Override
	public Owner findByLastName() {
		// TODO Auto-generated method stub
		return null;
	}
}
