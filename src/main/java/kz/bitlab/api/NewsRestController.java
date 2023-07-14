package kz.bitlab.api;

import kz.bitlab.dto.NewsDTO;
import kz.bitlab.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/news")
@RequiredArgsConstructor
public class NewsRestController {

    private final NewsService newsService;

    @GetMapping
    public List<NewsDTO> newsList() {
        return newsService.getNews();
    }

    @GetMapping(value = "{id}")
    public NewsDTO getNews(@PathVariable(name = "id") Long id) {
        return newsService.getNews(id);
    }

    @PostMapping
    public NewsDTO addNews(@RequestBody NewsDTO news) {
        news.setDate(new Date());
        return newsService.addNews(news);
    }

    @PutMapping
    public NewsDTO updateNews(@RequestBody NewsDTO news) {
        return newsService.updateNews(news);
    }

    @DeleteMapping(value = "{id}")
    public void deleteNews(@PathVariable(name = "id") Long id) {
        newsService.deleteNews(id);
    }

}
