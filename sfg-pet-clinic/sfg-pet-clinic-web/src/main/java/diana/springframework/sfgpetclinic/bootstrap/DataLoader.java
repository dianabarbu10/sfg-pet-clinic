package diana.springframework.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import diana.springframework.sfgpetclinic.model.Owner;
import diana.springframework.sfgpetclinic.model.Pet;
import diana.springframework.sfgpetclinic.model.PetType;
import diana.springframework.sfgpetclinic.model.Speciality;
import diana.springframework.sfgpetclinic.model.Vet;
import diana.springframework.sfgpetclinic.services.OwnerService;
import diana.springframework.sfgpetclinic.services.PetTypeService;
import diana.springframework.sfgpetclinic.services.SpecialityService;
import diana.springframework.sfgpetclinic.services.VetService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {

	@Autowired
	private final OwnerService ownerService;

	@Autowired
	private final VetService vetService;

	@Autowired
	private final PetTypeService petTypeService;

	@Autowired
	private final SpecialityService specialityService;

	@Override
	public void run(String... args) throws Exception {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);

		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		Speciality savedRadiology = specialityService.save(radiology);

		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		Speciality savedSurgery = specialityService.save(surgery);

		Speciality dentistry = new Speciality();
		dentistry.setDescription("dentistry");
		Speciality savedDentistry = specialityService.save(dentistry);

		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("1231231234");

		Pet mikesPet = new Pet();
		mikesPet.setPetType(savedDogPetType);
		mikesPet.setOwner(owner1);
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("Rosco");
		owner1.getPets().add(mikesPet);

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("123 Brickerel");
		owner2.setCity("Miami");
		owner2.setTelephone("1231231234");

		Pet fionasCat = new Pet();
		fionasCat.setName("Just Cat");
		fionasCat.setOwner(owner2);
		fionasCat.setBirthDate(LocalDate.now());
		fionasCat.setPetType(savedCatPetType);
		owner2.getPets().add(fionasCat);

		ownerService.save(owner2);

		System.out.println("Loaded Owners....");

		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vet1.getSpecialities().add(savedRadiology);

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vet2.getSpecialities().add(savedSurgery);

		vetService.save(vet2);

		System.out.println("Loaded Vets....");

	}

}
