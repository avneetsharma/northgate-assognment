package com.dangwal.processfileservice;

import javax.jws.WebService;


@WebService
interface  FileProcessService {
	File saveFile(byte[] bFile);
	
}
