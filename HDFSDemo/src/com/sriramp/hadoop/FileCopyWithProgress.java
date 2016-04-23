package com.sriramp.hadoop;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.util.Progressable;



public class FileCopyWithProgress {
	
	public static void main(String a[]) throws Exception
	{ 
	
		String localSrcString = "C:\\hwork\\cloudera.txt";
		String dstString = "hdfs://127.0.0.1:9000/output/cloudera.txt";
		InputStream inputStream  = new BufferedInputStream(new FileInputStream(localSrcString));
		Configuration configuration = new Configuration();
		FileSystem fs = FileSystem.get(URI.create(dstString), configuration);
		
		OutputStream outputStream = fs.create(new Path(dstString), new Progressable() {
			
			@Override
			public void progress() {
				
			System.out.println(".");	
			}
		});
		
		IOUtils.copyBytes(inputStream, outputStream, 4096, true);
	}

}
