package kz.bitlab.api;

import kz.bitlab.model.News;
import kz.bitlab.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/news")
public class NewsController {           // не самый лучший вариант для использования Rest. использую NewsRestController

    private final NewsService newsService;

    @GetMapping(value = "/get-news-list")
    public List<News> getNews() {
        return newsService.getNews();
    }

    @PostMapping(value = "/add-news")
    public News addNews(@RequestBody News news) {
        return newsService.addNews(news);
    }

}
