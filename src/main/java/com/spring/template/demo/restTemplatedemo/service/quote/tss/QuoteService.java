package com.spring.template.demo.restTemplatedemo.service.quote.tss;

public interface QuoteService {

	/**
	 * The 'inspirational' Quote category value.
	 */
	String CATEGORY_INSPIRATIONAL = "inspire";

	/**
	 * Retrieves the Quote of the day. A daily rotating Quote object.
	 * 
	 * @param category
	 *            An optional String value of a Quote category to retrieve. If not
	 *            specified, the default category value is used.
	 * @return A Quote object or <code>null</code> if none found.
	 */
	Quote getDaily(String category);
}