package com.ssm.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/downLoadZipFile")
public class DownLoadZipFile {

	/**
	 * 打包压缩下载文件
	 */
	@RequestMapping(value = "/zipDownload")
	public void downLoadZipFile(HttpServletResponse response) throws IOException {

		response.setContentType("APPLICATION/OCTET-STREAM");
		response.setHeader("Content-Disposition", "attachment; filename=" + this.getZipFilename());
		System.out.println("in BatchDownload................");

		ZipOutputStream zos = new ZipOutputStream(response.getOutputStream());

		File[] files = new File[2];
		files[0] = new File("D:\\wamp\\barimage.bmp");
		files[1] = new File("D:\\wamp\\images_off.bmp");
		
		
		 zipFile(files, "", zos);     
	     zos.flush();     
	     zos.close();   
	}
	
	 private void zipFile(File[] subs, String baseName, ZipOutputStream zos) throws IOException {       
	      for (int i=0;i<subs.length;i++) {  
	       File f=subs[i];  
	       zos.putNextEntry(new ZipEntry(baseName + f.getName()));     
	       FileInputStream fis = new FileInputStream(f);     
	       byte[] buffer = new byte[1024];     
	       int r = 0;     
	       while ((r = fis.read(buffer)) != -1) {     
	           zos.write(buffer, 0, r);     
	       }     
	       fis.close();   
	      }  
	 }
	 
	 private String getZipFilename(){  
		  Date date=new Date();  
		  String s=date.getTime()+".zip";  
		  return s;  
		 }  
}
