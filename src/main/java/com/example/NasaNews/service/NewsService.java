package com.example.NasaNews.service;

import com.example.NasaNews.payload.request.TranslateRequest;
import com.example.NasaNews.payload.response.TranslateResponse;

public interface NewsService {
    TranslateResponse getTranslated(TranslateRequest translateRequest);
}
