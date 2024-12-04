package api.utfpr.projeto2.models;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "confirmations")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Confirmation implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Basic(optional = false)
    @Column(name = "ra", nullable = false)
    private String ra;

    @Basic(optional = false)
    @Column(name = "student", nullable = false)
    private String student;

    @Basic(optional = false)
    @Column(name = "email", nullable = false)
    private String email;

    @Basic(optional = false)
    @Column(name = "professor", nullable = false)
    private String professor;

    @Basic(optional = false)
    @Column(name = "emailreceived", nullable = false)
    private Boolean emailReceived;

    @Basic(optional = false)
    @Column(name = "emailRead", nullable = false)
    private Boolean emailRead;

    @Basic(optional = false)
    @Column(name = "date")
    private Date date;

    public Confirmation(String ra, String student, String email, String professor, Boolean emailReceived, Boolean emailRead, Date date){
        this.ra = ra;
        this.student = student;
        this.email = email;
        this.professor = professor;
        this.emailReceived = emailReceived;
        this.emailRead = emailRead;
        this.date = date;
    }
}
