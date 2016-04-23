package com.sriramp.hadoop;

import java.io.InputStream;
import java.net.URL;

import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.io.IOUtils;

public class ReadDatafromHadoopUrl {
	
	

	static {
		URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
	}
	
	
	public static void main(String[] args) throws Exception
	{
		InputStream inputStream = null;
		String hdfsurl =  "hdfs://127.0.0.1:9000/input/samplehadoop.txt"; 
		
		try{
			
			inputStream = new URL(hdfsurl).openStream();
			IOUtils.copyBytes(inputStream, System.out, 4096, false);
			
		}finally{
			IOUtils.closeStream(inputStream);
		}
		
		
	}

}
