package com.spring.template.demo.restTemplatedemo.service.quote.tss;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuoteResponseSuccess {
	
	/**
     * The total number of objects contained in the response.
     */
    private int total;
}
