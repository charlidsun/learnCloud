package com.sun.zuulLearn.filter;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * 自定义过滤器
 * @author Administrator
 *
 */
public class MyFuilter extends ZuulFilter{

	
	/**
	 * 过滤器的具体逻辑。可用很复杂，包括查sql去判断该请求到底有没有权限访问。
	 */
	@Override
	public Object run() throws ZuulException {
		
		//首先拿到上下文
		RequestContext requestContext = new RequestContext();
		//拿到Httprequest
		HttpServletRequest request = requestContext.getRequest();
		//打印一些基本的信息
		System.out.println(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
		
		//拿到token
		Object token = request.getAttribute("token");
		
		//过滤token
		if (token == null) {
			requestContext.setSendZuulResponse(false);
			requestContext.setResponseStatusCode(401);
			try {
				requestContext.getResponse().getWriter().write("token is null");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		return null;
	}
	
	/**
	 * 这里可以写逻辑判断，是否要过滤，true,永远过滤
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}
	
	@Override
	public String filterType() {
		return "pre";
	}

	/**
	 * 过滤的顺序
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

}
