package com.example.NasaNews.controller;

import com.example.NasaNews.payload.request.TranslateRequest;
import com.example.NasaNews.payload.response.TranslateResponse;
import com.example.NasaNews.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TranslateController {

    private final NewsService newsService;

    @GetMapping("/news")
    public TranslateResponse translateNews(@RequestBody TranslateRequest translateRequest) {
        return newsService.getTranslated(translateRequest);
    }
}
