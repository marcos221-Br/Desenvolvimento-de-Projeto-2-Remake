package api.utfpr.projeto2.dtos;

import java.sql.Date;

import api.utfpr.projeto2.models.Confirmation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ConfirmationDtoResponse {
    
    private String email;
    private String professor;
    private Boolean emailReceived;
    private Boolean emailRead;
    private Date date;

    public static ConfirmationDtoResponse confirmationDto(Confirmation confirmation){
        return new ConfirmationDtoResponse(confirmation.getEmail(),confirmation.getProfessor(),confirmation.getEmailReceived(),confirmation.getEmailRead(),confirmation.getDate());
    }
}
