package com.example.NasaNews.controller;

import com.example.NasaNews.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TranslateController {

    private final NewsService newsService;

    @GetMapping("/news")
    public String translateNews(@RequestParam("description") String description) {
        return newsService.getTranslated(description);
    }
}
