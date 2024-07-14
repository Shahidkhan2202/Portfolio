package Portfolio.Portfolio.controller;

import Portfolio.Portfolio.model.Education;
import Portfolio.Portfolio.repositories.ProjectRepository;
import Portfolio.Portfolio.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/educations")
    ResponseEntity<List<Education>> getEducations(){
        return ResponseEntity.ok( homeService.getEducations());
    }
}

