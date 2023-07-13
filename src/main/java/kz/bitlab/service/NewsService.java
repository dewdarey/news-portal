package kz.bitlab.service;

import kz.bitlab.dto.NewsDTO;
import kz.bitlab.mapper.NewsMapper;
import kz.bitlab.model.News;
import kz.bitlab.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsService {

    private final NewsRepository newsRepository;
    private final NewsMapper newsMapper;

    public List<NewsDTO> getNews() {
        return newsMapper.toDtoList(newsRepository.findAll());
    }

    public NewsDTO addNews(NewsDTO news) {
        return newsMapper.toDto(newsRepository.save(newsMapper.toModel(news)));
    }

    public NewsDTO getNews(Long id) {
        return newsMapper.toDto(newsRepository.findById(id).orElse(new News()));
    }

    public NewsDTO updateNews(NewsDTO news) {
        return newsMapper.toDto(newsRepository.save(newsMapper.toModel(news)));
    }

    public void deleteNews(Long id) {
        newsRepository.deleteById(id);
    }

}
