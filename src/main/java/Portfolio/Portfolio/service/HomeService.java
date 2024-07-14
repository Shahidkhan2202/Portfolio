package Portfolio.Portfolio.service;

import Portfolio.Portfolio.model.Education;
import Portfolio.Portfolio.repositories.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {
    @Autowired
    EducationRepository educationRepository;
    public List<Education> getEducations() {
        return educationRepository.findAll();
    }
}
