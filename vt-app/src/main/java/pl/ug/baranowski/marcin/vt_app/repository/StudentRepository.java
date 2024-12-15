package pl.ug.baranowski.marcin.vt_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ug.baranowski.marcin.vt_app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
