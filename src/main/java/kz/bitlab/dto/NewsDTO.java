package kz.bitlab.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsDTO {
    private Long id;
    private String title;            // если во фронте вместо name будут использовать title
    private String description;
}
