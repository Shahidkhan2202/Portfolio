package Portfolio.Portfolio.controller;

import Portfolio.Portfolio.model.Education;
import Portfolio.Portfolio.model.Experience;
import Portfolio.Portfolio.model.Project;
import Portfolio.Portfolio.repositories.ProjectRepository;
import Portfolio.Portfolio.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/portfolio/data")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/educations")
    public List<Education> getEducations() {
        return homeService.getEducations();
    }

    @GetMapping("/experiences")
    public List<Experience> getExperiences() {
        return homeService.getExperiences();
    }

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return homeService.getProjects();
    }

}

