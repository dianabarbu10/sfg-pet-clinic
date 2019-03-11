package diana.springframework.sfgpetclinic.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import diana.springframework.sfgpetclinic.model.PetType;
import diana.springframework.sfgpetclinic.repositories.PetTypeRepository;
import diana.springframework.sfgpetclinic.services.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {
	@Autowired
	private PetTypeRepository petTypeRepository;

	@Override
	public PetType findById(Long id) {
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType petType) {
		return petTypeRepository.save(petType);
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> types = new HashSet<>();
		petTypeRepository.findAll().forEach(types::add);
		return types;
	}

	@Override
	public void delete(PetType petType) {
		petTypeRepository.delete(petType);
	}

}
