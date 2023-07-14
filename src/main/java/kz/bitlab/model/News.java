package kz.bitlab.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "t_news")
@Getter
@Setter
public class News extends BaseModel {       // наследуется от класса БэйсМодел, для добавления id

    @Column(name = "name")
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @PrePersist
    private void prePersist() {
        date = new Date();
    }

}
