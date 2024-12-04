package api.utfpr.projeto2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import api.utfpr.projeto2.models.Confirmation;

public interface ConfirmationRepository extends JpaRepository<Confirmation,Integer>{
    
    public List<Confirmation> findByRa(String ra);
}
