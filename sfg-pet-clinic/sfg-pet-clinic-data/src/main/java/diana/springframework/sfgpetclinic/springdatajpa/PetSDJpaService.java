package diana.springframework.sfgpetclinic.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import diana.springframework.sfgpetclinic.model.Pet;
import diana.springframework.sfgpetclinic.repositories.PetRepository;
import diana.springframework.sfgpetclinic.services.PetService;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {
	@Autowired
	private PetRepository petRepository;

	@Override
	public Pet findById(Long id) {
		return petRepository.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet pet) {
		return petRepository.save(pet);
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public void delete(Pet pet) {
		petRepository.delete(pet);
	}

}
