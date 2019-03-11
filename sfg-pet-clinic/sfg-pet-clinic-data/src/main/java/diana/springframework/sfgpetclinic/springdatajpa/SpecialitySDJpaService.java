package diana.springframework.sfgpetclinic.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import diana.springframework.sfgpetclinic.model.Speciality;
import diana.springframework.sfgpetclinic.repositories.SpecialityRepository;
import diana.springframework.sfgpetclinic.services.SpecialityService;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {
	@Autowired
	private SpecialityRepository specialityRepository;

	@Override
	public Speciality findById(Long id) {
		return specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality speciality) {
		return specialityRepository.save(speciality);
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<>();
		specialityRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public void delete(Speciality speciality) {
		specialityRepository.delete(speciality);

	}

}
