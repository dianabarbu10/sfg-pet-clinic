package diana.springframework.sfgpetclinic.services.map;

import java.util.Set;

import diana.springframework.sfgpetclinic.model.Vet;
import diana.springframework.sfgpetclinic.services.CRUDService;

public class VetServiceMap extends AbstractMapService<Vet, Long>
		implements
			CRUDService<Vet, Long> {
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet vet) {
		return super.save(vet.getId(), vet);
	}
	@Override
	public void delete(Vet vet) {
		super.delete(vet);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
