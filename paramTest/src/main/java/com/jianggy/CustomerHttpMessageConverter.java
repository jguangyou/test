package com.jianggy;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.StreamUtils;

public class CustomerHttpMessageConverter extends StringHttpMessageConverter {
	@Override
	public boolean supports(Class<?> clazz) {
		return String.class == clazz;
	}

	@Override
	protected String readInternal(Class<? extends String> clazz, HttpInputMessage inputMessage) throws IOException {
		System.out.println("readInternal======================");
		Charset charset = getContentTypeCharset(inputMessage.getHeaders().getContentType());
		String res = StreamUtils.copyToString(inputMessage.getBody(), charset);
		System.out.println(res);
		HttpHeaders headers = inputMessage.getHeaders();
		Set<Entry<String, List<String>>> sets = headers.entrySet();
		for (Iterator iterator = sets.iterator(); iterator.hasNext();) {
			Entry<String, List<String>> entry = (Entry<String, List<String>>) iterator.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		return res;
	}

	@Override
	protected Long getContentLength(String str, MediaType contentType) {
		System.out.println("getContentLength==========================");
		Charset charset = getContentTypeCharset(contentType);
		try {
			return (long) str.getBytes(charset.name()).length;
		} catch (UnsupportedEncodingException ex) {
			// should not occur
			throw new IllegalStateException(ex);
		}
	}

	@Override
	protected void writeInternal(String str, HttpOutputMessage outputMessage) throws IOException {
		System.out.println("writeInternal==============================");
		outputMessage.getHeaders().setAcceptCharset(getAcceptedCharsets());

		Charset charset = getContentTypeCharset(outputMessage.getHeaders().getContentType());
		StreamUtils.copy(str, charset, outputMessage.getBody());
	}

	/**
	 * Return the list of supported {@link Charset}s.
	 * <p>
	 * By default, returns {@link Charset#availableCharsets()}. Can be
	 * overridden in subclasses.
	 * 
	 * @return the list of accepted charsets
	 */
	@Override
	protected List<Charset> getAcceptedCharsets() {
		System.out.println("getAcceptedCharsets");
		List<Charset> charsets = super.getAcceptedCharsets();
		return charsets;
	}

	private Charset getContentTypeCharset(MediaType contentType) {
		if (contentType != null && contentType.getCharset() != null) {
			return contentType.getCharset();
		} else {
			return getDefaultCharset();
		}
	}
}
