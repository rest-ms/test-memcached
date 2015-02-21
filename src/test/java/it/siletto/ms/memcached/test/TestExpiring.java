package it.siletto.ms.memcached.test;

import it.siletto.ms.memcached.test.dto.SimpleObject;

import java.net.InetSocketAddress;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import net.spy.memcached.MemcachedClient;

public class TestExpiring {

	public static void main(String[] args) throws Exception {
		
		
		MemcachedClient c=new MemcachedClient(new InetSocketAddress("192.168.1.104", 11211));

			SimpleObject someObject = SimpleObject.createRandom();
		
			c.set("aaa", 5, someObject);

			System.out.println(ToStringBuilder.reflectionToString(someObject, ToStringStyle.MULTI_LINE_STYLE));

			System.out.println("sleeping for 6 seconds");
			Thread.sleep(6000);
			
			Object myObject=c.get("aaa");
			
			System.out.println(ToStringBuilder.reflectionToString(myObject, ToStringStyle.MULTI_LINE_STYLE));

	}
}
