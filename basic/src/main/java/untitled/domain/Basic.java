package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.BasicApplication;

@Entity
@Table(name = "Basic_table")
@Data
//<<< DDD / Aggregate Root
public class Basic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String userId;

    @Embedded
    private CompanyId companyId;

    public static BasicRepository repository() {
        BasicRepository basicRepository = BasicApplication.applicationContext.getBean(
            BasicRepository.class
        );
        return basicRepository;
    }
}
//>>> DDD / Aggregate Root
