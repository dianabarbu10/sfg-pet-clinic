package diana.springframework.sfgpetclinic.services;

import java.util.Set;

import diana.springframework.sfgpetclinic.model.Vet;

public interface VetService {

	Vet findById();

	Vet save(Vet vet);

	Set<Vet> findAll();
}
