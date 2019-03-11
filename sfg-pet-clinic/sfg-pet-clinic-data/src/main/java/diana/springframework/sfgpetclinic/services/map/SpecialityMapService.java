package diana.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import diana.springframework.sfgpetclinic.model.Speciality;
import diana.springframework.sfgpetclinic.services.SpecialityService;

@Service
@Profile({ "default", "map" })
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality petType) {
		return super.save(petType);
	}

	@Override
	public void delete(Speciality petType) {
		super.delete(petType);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
