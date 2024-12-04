package api.utfpr.projeto2.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.utfpr.projeto2.dtos.ConfirmationDto;
import api.utfpr.projeto2.dtos.ConfirmationDtoResponse;
import api.utfpr.projeto2.models.Confirmation;
import api.utfpr.projeto2.services.ConfirmationService;

@RestController
@RequestMapping("/api/confirmation")
public class ConfirmationController {
    
    @Autowired
    private ConfirmationService confirmationService;

    @PostMapping
    public ConfirmationDtoResponse createConfirmation(@RequestBody ConfirmationDto confirmationDto){
        return ConfirmationDtoResponse.confirmationDto(this.confirmationService.createConfirmation(confirmationDto.confirmationObject()));
    }

    @GetMapping
    public List<ConfirmationDtoResponse> getAllConfirmations(){
        List<ConfirmationDtoResponse> confirmationDtoResponses = new ArrayList<>();
        List<Confirmation> confirmations = this.confirmationService.getAllConfirmations();
        for(Confirmation confirmation : confirmations){
            confirmationDtoResponses.add(ConfirmationDtoResponse.confirmationDto(confirmation));
        }
        return confirmationDtoResponses;
    }

    @GetMapping("/{ra}")
    public List<ConfirmationDtoResponse> getRaConfirmations(@PathVariable String ra){
        List<ConfirmationDtoResponse> confirmationDtoResponses = new ArrayList<>();
        List<Confirmation> confirmations = this.confirmationService.getByRa(ra);
        for(Confirmation confirmation : confirmations){
            confirmationDtoResponses.add(ConfirmationDtoResponse.confirmationDto(confirmation));
        }
        return confirmationDtoResponses;
    }
}
