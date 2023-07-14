package kz.bitlab.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class NewsDTO {
    private Long id;
    private String title;            // если во фронте вместо name будут использовать title
    private String description;
    private Date date;
}
