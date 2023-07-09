package kz.bitlab.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_news")
@Getter
@Setter
public class News extends BaseModel {       // наследуется от класса БэйсМодел, для добавления id

    @Column(name = "name")
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

}
