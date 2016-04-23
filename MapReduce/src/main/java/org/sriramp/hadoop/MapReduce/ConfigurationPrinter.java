package org.sriramp.hadoop.MapReduce;

import org.apache.commons.collections.map.StaticBucketMap;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import com.google.common.collect.Multiset.Entry;

public class ConfigurationPrinter extends Configured implements Tool {

	static {
		Configuration.addDefaultResource("C:\\hadoop-2.3.0\\etc\\hadoop\\hdfs-default.xml");
		
	}
	
	
	@Override
	public int run(String[] arg0) throws Exception {
		Configuration conf = getConf(); 
		
		System.out.println(conf);
		return 0;
	}

	public static void main(String[] a) throws Exception
	{
		int exitCode = ToolRunner.run(new ConfigurationPrinter(), a);
		System.exit(exitCode);
		
	}
}
