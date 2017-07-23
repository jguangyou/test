package com.jianggy;

import java.io.IOException;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

public class JsonConvert extends MappingJackson2HttpMessageConverter {

	@Override
	protected Object readInternal(Class<? extends Object> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		return super.readInternal(clazz, inputMessage);
	}

}
