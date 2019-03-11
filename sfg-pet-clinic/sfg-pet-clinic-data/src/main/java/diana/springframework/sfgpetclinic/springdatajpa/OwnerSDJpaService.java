package diana.springframework.sfgpetclinic.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import diana.springframework.sfgpetclinic.model.Owner;
import diana.springframework.sfgpetclinic.repositories.OwnerRepository;
import diana.springframework.sfgpetclinic.repositories.PetRepository;
import diana.springframework.sfgpetclinic.repositories.PetTypeRepository;
import diana.springframework.sfgpetclinic.services.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {
	@Autowired
	private OwnerRepository ownerRepository;
	@Autowired
	private PetRepository petRepository;
	@Autowired
	private PetTypeRepository petTypeRepository;

	@Override
	public Owner findById(Long id) {
		Optional<Owner> owner = ownerRepository.findById(id);
		if (owner.isPresent())
			return owner.get();
		return null;
	}

	@Override
	public Owner save(Owner owner) {
		return ownerRepository.save(owner);
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public void delete(Owner owner) {
		ownerRepository.delete(owner);

	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}

}
