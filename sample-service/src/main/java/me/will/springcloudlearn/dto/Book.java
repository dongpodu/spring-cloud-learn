package me.will.springcloudlearn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by duyisong on 12/09/2018.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Book {
    private Long id;
    private String author;
    private String title;
}
