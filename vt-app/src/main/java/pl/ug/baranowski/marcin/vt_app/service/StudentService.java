package pl.ug.baranowski.marcin.vt_app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.ug.baranowski.marcin.vt_app.controller.StudentController;
import pl.ug.baranowski.marcin.vt_app.model.Student;
import pl.ug.baranowski.marcin.vt_app.repository.StudentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
