//package com.dangwal.processfileservice;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.xml.ws.Response;
//import java.io.FileInputStream;
//
//@RestController
//public class AccessBuildPathFile {
//  @GetMapping("/getExcelFile")
//  public Response getFile() {
//      File file = new File(FILE_PATH);
//      ResponseBuilder
//              response = Response.ok((Object) file);
//      response.header("Content-Disposition", "attachment; filename=newfile.zip");
//      return response.build();
//
//  }
//}
