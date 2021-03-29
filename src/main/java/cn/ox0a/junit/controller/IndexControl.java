/**
 * 
 */
package cn.ox0a.junit.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangliang
 *	for test
 */
@RestController
@RequestMapping("/index")
public class IndexControl {
	@Value("${interface.port}")
	private String port;
	
	@RequestMapping(value="/port", method= RequestMethod.POST)
	public Map<String, String> getPort(){
	    Map<String, String> portInfo = new HashMap<String, String>();
	    portInfo.put("port", port);
		return portInfo;
	}
}
