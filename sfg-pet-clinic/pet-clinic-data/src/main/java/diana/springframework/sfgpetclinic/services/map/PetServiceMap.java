package diana.springframework.sfgpetclinic.services.map;

import java.util.Set;

import diana.springframework.sfgpetclinic.model.Pet;
import diana.springframework.sfgpetclinic.services.CRUDService;

public class PetServiceMap extends AbstractMapService<Pet, Long>
		implements
			CRUDService<Pet, Long> {
	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet pet) {
		return super.save(pet.getId(), pet);
	}
	@Override
	public void delete(Pet pet) {
		super.delete(pet);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
