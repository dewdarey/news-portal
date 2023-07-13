package kz.bitlab.mapper;

import kz.bitlab.dto.NewsDTO;
import kz.bitlab.model.News;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NewsMapper {

    @Mapping(source = "name", target = "title")         // из name (в бэке) к title (в фронте)
    NewsDTO toDto(News news);

    @Mapping(source = "title", target = "name")         // из title (в фронте) к name (в бэке)
    News toModel(NewsDTO newsDTO);

    List<NewsDTO> toDtoList(List<News> newsList);
    List<News> toModelList(List<NewsDTO> newsList);

}
