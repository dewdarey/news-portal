package kz.bitlab.service;

import kz.bitlab.model.News;
import kz.bitlab.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsService {

    private final NewsRepository newsRepository;

    public List<News> getNews() {
        return newsRepository.findAll();
    }

    public News addNews(News news) {
        return newsRepository.save(news);
    }

    public News getNews(Long id) {
        return newsRepository.findById(id).orElse(new News());
    }

}
