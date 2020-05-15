package com.dangwal.processfileservice;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Configuration
public class ServiceConfig {
    @Autowired
    private Bus bus;
    @Autowired
    private FileProcessService fileProcessService;

    @Bean
    public Endpoint endPoint() {
        Endpoint endpoint = new EndpointImpl(bus, fileProcessService);
        endpoint.publish("/getInfo");

        String filePath = "C:\\Users\\babita.dangwal\\Desktop\\data\\z.jpg";
        try {
            byte[] bFile = Files.readAllBytes(Paths.get(filePath));
            System.out.println("here 1"+fileProcessService.saveFile(bFile));
        } catch (IOException e) {
            e.printStackTrace();
        }


        return endpoint;
    }
}
