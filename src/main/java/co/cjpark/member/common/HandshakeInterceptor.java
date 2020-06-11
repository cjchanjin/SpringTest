package co.cjpark.member.common;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor{

	
	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
		
		ServletServerHttpRequest ssreq = (ServletServerHttpRequest) request;
		HttpServletRequest req = ssreq.getServletRequest();
		
		LoginVO loginvo = (LoginVO) req.getSession().getAttribute("loginVo");
		attributes.put("loginvo",  loginvo);
		
//		attributes.put("userLoc", req.getSession().getAttribute("userLoc"));
		
//		attributes.put(UserConstant.HEADER_USER_KEY, userService.findBy(user.getId()));
		return super.beforeHandshake(request, response, wsHandler, attributes);
	}

}
