package pl.ug.baranowski.marcin.vt_app.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.ug.baranowski.marcin.vt_app.model.Student;
import pl.ug.baranowski.marcin.vt_app.service.StudentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);


    @GetMapping("/")
    public String hello() {
        return "Welcome to VT-App";
    }

    @GetMapping("/students")
    public List<Student> allStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/block/{seconds}")
    public List<Student> getAllStudents(@PathVariable Integer seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
        log.info("Blocked for {} seconds", seconds);
        return studentService.getAllStudents();
    }
}
