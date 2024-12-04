package api.utfpr.projeto2.dtos;

import java.sql.Date;

import api.utfpr.projeto2.models.Confirmation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class ConfirmationDto {
    
    private String ra;
    private String student;
    private String email;
    private String professor;
    private Boolean emailReceived;
    private Boolean emailRead;
    private Date date;

    public Confirmation confirmationObject(){
        return new Confirmation(ra,student,email,professor,emailReceived,emailRead,Date.valueOf(date.toLocalDate().plusDays(1)));
    }
}
