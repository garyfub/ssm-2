package com.ssm.pojo.util;

import java.io.Serializable;

public class MyFile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1100669842402516608L;
	
	private String clientFile;  
    
    private String serverFile;  
      
    private long position;  
      
    private byte[] bytes;

	public String getClientFile() {
		return clientFile;
	}

	public void setClientFile(String clientFile) {
		this.clientFile = clientFile;
	}

	public String getServerFile() {
		return serverFile;
	}

	public void setServerFile(String serverFile) {
		this.serverFile = serverFile;
	}

	public long getPosition() {
		return position;
	}

	public void setPosition(long position) {
		this.position = position;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}  
  
    
    

}
