package it.siletto.ms.memcached.test;

import it.siletto.ms.memcached.test.dto.SimpleObject;

import java.net.InetSocketAddress;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import net.spy.memcached.MemcachedClient;

public class TestReadWrite {

	public static void main(String[] args) throws Exception {
		
		
		MemcachedClient c=new MemcachedClient(new InetSocketAddress("192.168.1.104", 11211));

			SimpleObject someObject = SimpleObject.createRandom();
		
			c.set("someKey", 3600, someObject);

			System.out.println(ToStringBuilder.reflectionToString(someObject, ToStringStyle.MULTI_LINE_STYLE));
			
			
			Object myObject=c.get("someKey");
			
			System.out.println(ToStringBuilder.reflectionToString(myObject, ToStringStyle.MULTI_LINE_STYLE));

	}
}
