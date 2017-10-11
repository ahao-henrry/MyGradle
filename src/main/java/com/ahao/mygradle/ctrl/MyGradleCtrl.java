package com.ahao.mygradle.ctrl;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ahao.mygradle.util.HttpTool;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/MyGradleCtrl/")
public class MyGradleCtrl {
	static Logger logger = LoggerFactory.getLogger(MyGradleCtrl.class);

	@ResponseBody
	@RequestMapping("testHello")
	public String testHello(HttpServletRequest request) {
		JSONObject jsonParam = HttpTool.readJSONParam(request);
		logger.info("--****got the param is : {}", jsonParam);
		return jsonParam.toJSONString();
	}
}
