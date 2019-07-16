/*
 * *****************************************************
 * *****************************************************
 * Copyright (C), 2018-2020, panda-fa.com
 * FileName: com.panda.rpc.demo.provider.HelloImpl1
 * Author:   丁许
 * Date:     2019/7/15 18:46
 * *****************************************************
 * *****************************************************
 */
package com.panda.rpc.demo.provider;

import com.panda.rpc.annotation.RpcService;
import com.panda.rpc.demo.api.Ihello;

/**
 * <Description>
 *
 * @author 丁许
 * @date 2019/7/15 18:46
 */
@RpcService(value = Ihello.class,version = "1.0")
public class HelloImpl1Version implements Ihello {

	@Override
	public String sayHello(String name) {
		return "HelloImpl1 version 1.0.sayHello:" + name;
	}
}
