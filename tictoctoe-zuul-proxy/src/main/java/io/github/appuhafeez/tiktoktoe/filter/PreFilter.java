package io.github.appuhafeez.tiktoktoe.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Configuration;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import io.github.appuhafeez.tiktoktoe.enums.FilterEnum;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class PreFilter extends ZuulFilter {
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info("adding header to :: {}", request.getRequestURI());
		String authHeader = request.getHeader("Authorization");
		ctx.addZuulRequestHeader("Authorization", authHeader);
		return ctx;
	}

	@Override
	public String filterType() {
		return FilterEnum.PRE_FILTER.getFilterType();
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
