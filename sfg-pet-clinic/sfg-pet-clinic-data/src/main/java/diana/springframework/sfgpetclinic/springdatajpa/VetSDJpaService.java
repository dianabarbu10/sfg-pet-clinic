package diana.springframework.sfgpetclinic.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import diana.springframework.sfgpetclinic.model.Vet;
import diana.springframework.sfgpetclinic.repositories.VetRepository;
import diana.springframework.sfgpetclinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {
	@Autowired
	private VetRepository vetRepository;

	@Override
	public Vet findById(Long id) {
		Optional<Vet> vet = vetRepository.findById(id);
		if (vet.isPresent())
			return vet.get();
		return null;
	}

	@Override
	public Vet save(Vet vet) {
		return vetRepository.save(vet);
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public void delete(Vet vet) {
		vetRepository.delete(vet);

	}

}
