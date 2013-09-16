/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.zookeeper;

import java.util.List;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;

/**
 * 类ZookeeperConnect.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-11 上午11:18:11
 */
public class ZookeeperConnect {

	final static String ipPort = "10.10.43.22:2181";
	final static int sessionTimeout = 500000;

	public static void main(String[] args) {
		ZookeeperConnect zookeeperConnect = new ZookeeperConnect();
		zookeeperConnect.connectLocalZookeeper();
	}

	public void connectLocalZookeeper() {
		try {
			ZooKeeper zk = new ZooKeeper(ipPort, sessionTimeout, new Watcher() {

				public void process(WatchedEvent event) {
					System.out.println(event.toString());
				}
			});

			System.out.println(zk.create("/root", "mydata".getBytes(),
					Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT));
			System.out.println(zk.create("/root/childone",
					"childone".getBytes(), Ids.OPEN_ACL_UNSAFE,
					CreateMode.PERSISTENT));

			List<String> list = zk.getChildren("/root", true);
			System.out.println(new String(zk.getData("/root/childone", true,
					null)));
			zk.setData("/root/childone", "childonemodify".getBytes(), -1);
			zk.delete("/root/childone", -1);
			zk.delete("/root", -1);
			zk.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
