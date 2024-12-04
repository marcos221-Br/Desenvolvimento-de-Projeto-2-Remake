package api.utfpr.projeto2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.utfpr.projeto2.models.Confirmation;
import api.utfpr.projeto2.repositories.ConfirmationRepository;

@Service
public class ConfirmationService {
    
    @Autowired
    private ConfirmationRepository confirmationRepository;

    public Confirmation createConfirmation(Confirmation confirmation){
        return this.confirmationRepository.save(confirmation);
    }

    public List<Confirmation> getAllConfirmations(){
        return this.confirmationRepository.findAll();
    }

    public List<Confirmation> getByRa(String ra){
        return this.confirmationRepository.findByRa(ra);
    }
}
