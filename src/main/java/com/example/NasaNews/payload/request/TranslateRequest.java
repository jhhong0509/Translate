package com.example.NasaNews.payload.request;

import lombok.*;
import org.springframework.lang.Nullable;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TranslateRequest {

    @Nullable
    private String title;

    @Nullable
    private String description;

}
