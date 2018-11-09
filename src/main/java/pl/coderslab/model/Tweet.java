package pl.coderslab.model;

import com.sun.istack.internal.Nullable;
import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "tweet")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 5, max = 50)
    @NotNull
    private String title;

    @NotNull
    @Size(max=160)
    private String tweetText;

    private LocalDate created = LocalDate.now();

    @ManyToOne
    private User user;


    //---------------------------------------------------------------------------
    //---GETTERY i SETTERY
    //---------------------------------------------------------------------------


}
