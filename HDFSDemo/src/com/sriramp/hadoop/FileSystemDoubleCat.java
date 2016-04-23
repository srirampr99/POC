package com.sriramp.hadoop;

import java.io.InputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class FileSystemDoubleCat {
	
	public static void main(String a[]) throws Exception
	{
		String url = "hdfs://127.0.0.1:9000/input/samplehadoop.txt";
		
		Configuration configuration = new Configuration();
		
		FileSystem fs = FileSystem.get(URI.create(url), configuration);
		FSDataInputStream inputStream  = null;
		
		try {
			
			inputStream = fs.open(new Path(url));
			
			IOUtils.copyBytes(inputStream, System.out, 4096, false);
			
			inputStream.seek(0);
			IOUtils.copyBytes(inputStream, System.out, 4096, false);
		}finally{
			
		}
	}


}
