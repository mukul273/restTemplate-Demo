package com.spring.template.demo.restTemplatedemo.service.quote.tss;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown=true)
@Data
public class QuoteResponseContents {

	/**
     * An array of Quote objects.
     */
    private ArrayList<Quote> quotes = new ArrayList<Quote>(0);
}
