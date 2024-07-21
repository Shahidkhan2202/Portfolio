package Portfolio.Portfolio.service;

import Portfolio.Portfolio.model.Education;
import Portfolio.Portfolio.model.Experience;
import Portfolio.Portfolio.model.Project;
import Portfolio.Portfolio.repositories.EducationRepository;
import Portfolio.Portfolio.repositories.ExperienceRepository;
import Portfolio.Portfolio.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {
    @Autowired
   private EducationRepository educationRepository;

    @Autowired
    private ExperienceRepository experienceRepository;

    @Autowired
    private ProjectRepository projectRepository;

    public List<Education> getEducations() {
        return educationRepository.findAll();

    }
    public List<Experience> getExperiences(){
        return experienceRepository.findAll();
    }
    public List<Project> getProjects(){
        return projectRepository.findAll();
    }
}
