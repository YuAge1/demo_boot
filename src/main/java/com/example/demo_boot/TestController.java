package com.example.demo_boot;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final PersonDao personDao;

    @GetMapping("/show/{id}")
    public Person show(@PathVariable Integer id) {
        return personDao.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }
}
