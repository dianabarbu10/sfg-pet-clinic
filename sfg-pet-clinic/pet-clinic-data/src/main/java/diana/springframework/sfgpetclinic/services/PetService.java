package diana.springframework.sfgpetclinic.services;

import java.util.Set;

import diana.springframework.sfgpetclinic.model.Pet;

public interface PetService {

	Pet findById();

	Pet save(Pet pet);

	Set<Pet> findAll();
}
