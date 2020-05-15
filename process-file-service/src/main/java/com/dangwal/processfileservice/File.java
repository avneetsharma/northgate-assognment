package com.dangwal.processfileservice;

import javax.persistence.*;

@Entity
public class File {
	@Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Lob
	private byte[] fileData;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
}
