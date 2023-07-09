package kz.bitlab.api;

import kz.bitlab.model.News;
import kz.bitlab.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/news")
@RequiredArgsConstructor
public class NewsRestController {

    private final NewsService newsService;

    @GetMapping
    public List<News> newsList() {
        return newsService.getNews();
    }

    @GetMapping(value = "{id}")
    public News getNews(@PathVariable(name = "id") Long id) {
        return newsService.getNews(id);
    }

    @PostMapping
    public News addNews(@RequestBody News news) {
        return newsService.addNews(news);
    }

}
