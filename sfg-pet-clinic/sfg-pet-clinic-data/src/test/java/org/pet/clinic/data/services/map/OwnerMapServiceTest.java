package org.pet.clinic.data.services.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import diana.springframework.sfgpetclinic.model.Owner;
import diana.springframework.sfgpetclinic.services.map.OwnerMapService;
import diana.springframework.sfgpetclinic.services.map.PetMapService;
import diana.springframework.sfgpetclinic.services.map.PetTypeMapService;

public class OwnerMapServiceTest {

	OwnerMapService ownerMapService;
	final long ownerId = 1L;
	String lastName = "Smith";
	@BeforeEach
	public void setup() {
		ownerMapService = new OwnerMapService(new PetTypeMapService(),
				new PetMapService());
		ownerMapService.save(Owner.builder().id(ownerId).build());
	}
	@Test
	public void testFindAll() {
		Set<Owner> allOwners = ownerMapService.findAll();
		assertEquals(1, allOwners.size());
		assertEquals(ownerId, allOwners.iterator().next().getId(), 0.1);
	}

	@Test
	void findById() {
		Owner owner = ownerMapService.findById(ownerId);

		assertEquals(ownerId, owner.getId(), 0.1);
	}

	@Test
	void saveExistingId() {
		Long id = 2L;

		Owner owner2 = Owner.builder().id(id).build();

		Owner savedOwner = ownerMapService.save(owner2);

		assertEquals(id, savedOwner.getId());

	}

	@Test
	void saveNoId() {

		Owner savedOwner = ownerMapService.save(Owner.builder().build());

		assertNotNull(savedOwner);
		assertNotNull(savedOwner.getId());
	}

	@Test
	void delete() {
		ownerMapService.delete(ownerMapService.findById(ownerId));

		assertEquals(0, ownerMapService.findAll().size());
	}

	@Test
	void deleteById() {
		ownerMapService.deleteById(ownerId);

		assertEquals(0, ownerMapService.findAll().size());
	}

	@Test
	void findByLastName() {
		Owner smith = ownerMapService.findByLastName(lastName);

		assertNotNull(smith);

		assertEquals(ownerId, smith.getId(), 0.01);

	}

	@Test
	void findByLastNameNotFound() {
		Owner smith = ownerMapService.findByLastName("foo");

		assertNull(smith);
	}
}
