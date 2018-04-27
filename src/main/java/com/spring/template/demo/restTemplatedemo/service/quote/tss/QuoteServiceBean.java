package com.spring.template.demo.restTemplatedemo.service.quote.tss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteServiceBean implements QuoteService {
	
	/**
     * The Logger for this class.
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * The RestTemplate used to retrieve data from the remote Quote API.
     */
    private final RestTemplate restTemplate;
    
    /**
     * Construct a QuoteServiceBean with a RestTemplateBuilder used to
     * instantiate the RestTemplate used by this business service.
     * @param restTemplateBuilder A RestTemplateBuilder injected from the
     *        ApplicationContext.
     */
    @Autowired
    public QuoteServiceBean(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    
    @Override
    public Quote getDaily(String category) {
        logger.info("> getDaily");

        String quoteCategory = QuoteService.CATEGORY_INSPIRATIONAL;
        if (category != null && category.trim().length() > 0) {
            quoteCategory = category.trim();
        }

        QuoteResponse quoteResponse = this.restTemplate.getForObject(
                "http://quotes.rest/qod.json?category={cat}",
                QuoteResponse.class, quoteCategory);

        Quote quote = quoteResponse.getQuote();

        logger.info("< getDaily");
        return quote;
    }
}