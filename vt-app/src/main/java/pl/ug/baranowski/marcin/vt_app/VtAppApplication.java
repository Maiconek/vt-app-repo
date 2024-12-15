package pl.ug.baranowski.marcin.vt_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.ug.baranowski.marcin.vt_app.model.Student;
import pl.ug.baranowski.marcin.vt_app.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class VtAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VtAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
//			List<String> namesList = List.of("Marcin", "Jan", "Kacper", "Ryhor", "Mateusz",
//					"Konrad", "Jakub", "Piotr", "Olgierd", "Slawomir", "Waclaw", "Pawel", "Mikolaj",
//					"Michal", "Cezary", "Wojtek", "Daniel", "Kajetan", "Igor", "Milosz");
//
//			List<String> surnames = List.of("Kowalski", "Nowak", "Baranowski", "Dzieciol",
//					"Zlotopolski", "Czerepach", "Jachas", "Milowski", "Prosty", "Dlugi", "Pawelczak",
//					"Boniek", "Kardas", "Musial", "Raszczyk", "Dunaj", "Lewandowski", "Zdun", "Cieplik", "Dlugosz");
//
//			Random random = new Random();
//
//			for (int i = 0; i < 200; i++) {
//				String firstName = namesList.get(random.nextInt(namesList.size()));
//				String lastName = surnames.get(random.nextInt(surnames.size()));
//
//				Student student = Student.builder()
//									.firstname(firstName).lastname(lastName).build();
//				studentRepository.save(student);
//			}
//			Student student = Student.builder().firstname("Waldemar").lastname("Kiepski").build();
//			studentRepository.save(student);
		};
	}

}
