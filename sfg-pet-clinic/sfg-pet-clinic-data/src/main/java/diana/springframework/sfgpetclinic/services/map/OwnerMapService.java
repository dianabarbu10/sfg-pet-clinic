package diana.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import diana.springframework.sfgpetclinic.model.Owner;
import diana.springframework.sfgpetclinic.model.Pet;
import diana.springframework.sfgpetclinic.services.OwnerService;
import diana.springframework.sfgpetclinic.services.PetService;
import diana.springframework.sfgpetclinic.services.PetTypeService;

@Service
@Profile({"default", "map"})
public class OwnerMapService extends AbstractMapService<Owner, Long>
		implements
			OwnerService {
	private PetTypeService petTypeService;
	private PetService petService;
	public OwnerMapService(PetTypeMapService petTypeMapService,
			PetMapService petMapService) {
		this.petTypeService = petTypeMapService;
		this.petService = petMapService;
	}

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
		if (owner != null) {
			if (owner.getPets() != null) {
				owner.getPets().forEach(pet -> {
					if (pet.getPetType() != null) {
						if (pet.getPetType().getId() == null) {
							pet.setPetType(
									petTypeService.save(pet.getPetType()));
						}
					} else {
						throw new RuntimeException("Pet Type is required");
					}

					if (pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}

			return super.save(owner);

		} else {
			return null;
		}
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
	public Owner findByLastName(String lastName) {
		return this.findAll().stream()
				.filter(owner -> owner.getLastName().equalsIgnoreCase(lastName))
				.findFirst().orElse(null);
	}
}
