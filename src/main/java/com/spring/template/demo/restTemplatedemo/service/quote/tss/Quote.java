package com.spring.template.demo.restTemplatedemo.service.quote.tss;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown=true)
public class Quote {
	
	/**
     * A uniquie identifier.
     */
    private String id;
    /**
     * The quote, or quote category, title.
     */
    private String title;
    /**
     * The quote text.
     */
    private String quote;
    /**
     * The length of the quote text.
     */
    private String length;
    /**
     * The date the quote was provided by the external service.
     */
    private Date date;
    /**
     * The person or entity to whom the quote is attributed.
     */
    private String author;
    /**
     * An image associated with the quote text.
     */
    private String background;
    /**
     * The category or general grouping to which the quote text belongs.
     */
    private String category;
    /**
     * An array of tags, often the categories, which are applicable to the quote
     * text.
     */
    private ArrayList<String> tags;
}