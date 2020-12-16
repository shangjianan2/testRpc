/*
 * *****************************************************
 * *****************************************************
 * Copyright (C), 2018-2020, panda-fa.com
 * FileName: com.panda.rpc.demo.consumer.ClientDemo
 * Author:   丁许
 * Date:     2019/7/15 20:21
 * *****************************************************
 * *****************************************************
 */
package com.panda.rpc.demo.consumer;

import com.panda.rpc.client.RpcClientProxy;
import com.panda.rpc.demo.api.Ihello;
import lombok.extern.slf4j.Slf4j;

/**
 * <Description>
 *
 * @author 丁许
 * @date 2019/7/15 20:21
 */
@Slf4j
public class ClientDemo {

	public static void main(String[] args) throws InterruptedException {
		RpcClientProxy rpcClientProxy = new RpcClientProxy(null);

		//测试服务版本
		try {
			Ihello ihello = rpcClientProxy.clientProxy(Ihello.class, "1.0");
			System.out.println(ihello.sayHello("dd"));
		} catch (Exception e) {
			log.error("调用失败：e:{}",e.toString());
		}
		//测试集群
		for (int i = 0; i < 10; i++) {
			Ihello helloService = rpcClientProxy.clientProxy(Ihello.class);
			try {
				String result=helloService.sayHello("xxx");
				System.out.println(result);
			} catch (Exception e) {
				log.error("调用失败：e:{}",e.toString());
			}

			Thread.sleep(2000);
		}
	}
}
