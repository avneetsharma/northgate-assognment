package com.dangwal.processfileservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service public class FileProcessServieImpl implements FileProcessService {
	@Autowired
	FileRepository repository;
	public File saveFile(byte[] bFile) {
		System.out.println(repository);
		File file = new File();
		file.setFileData(bFile);
		return repository.save(file);
	}

}
