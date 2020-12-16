/*
 * *****************************************************
 * *****************************************************
 * Copyright (C), 2018-2020, panda-fa.com
 * FileName: com.panda.rpc.demo.provider.ServerDemo1
 * Author:   丁许
 * Date:     2019/7/15 18:46
 * *****************************************************
 * *****************************************************
 */
package com.panda.rpc.demo.provider;

import com.panda.rpc.demo.api.Ihello;
import com.panda.rpc.server.RpcServer;

import java.util.Arrays;

/**
 * <Description>
 *
 * @author 丁许
 * @date 2019/7/15 18:46
 */
public class ServerDemo1 {

	public static void main(String[] args) throws InterruptedException {
		Ihello helloService = new HelloImpl1();
		Ihello helloService2=new HelloImpl1Version();
		RpcServer rpcServer = new RpcServer(null, "127.0.0.1", 8888);
		rpcServer.bindService(Arrays.asList(helloService,helloService2));
		rpcServer.publish();
	}
}
