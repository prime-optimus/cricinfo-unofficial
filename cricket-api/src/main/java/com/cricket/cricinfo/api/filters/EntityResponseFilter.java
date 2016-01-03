package com.cricket.cricinfo.api.filters;

import java.io.IOException;
import java.lang.annotation.Annotation;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

public class EntityResponseFilter implements ContainerResponseFilter {

	public void filter(ContainerRequestContext reqc,
			ContainerResponseContext resc) throws IOException {
		MediaType mediaType = this.getMediaTypeFromExtentionOrHeader(reqc);
		resc.setEntity(resc.getEntity(), new Annotation[0], mediaType);
	}

	private MediaType getMediaTypeFromExtentionOrHeader(
			ContainerRequestContext reqc) {
		MediaType mediaType = MediaType.APPLICATION_JSON_TYPE;

		MultivaluedMap<String, String> pathParameters = reqc.getUriInfo().getPathParameters();
		if (StringUtils.contains(MapUtils.getString(pathParameters, "extension"), ".xml")) {
			mediaType = MediaType.APPLICATION_XML_TYPE;
		} else if (StringUtils.contains(MapUtils.getString(pathParameters, "extension"), ".html")) {
			mediaType = MediaType.TEXT_HTML_TYPE;
		}
		return mediaType;
	}

}
