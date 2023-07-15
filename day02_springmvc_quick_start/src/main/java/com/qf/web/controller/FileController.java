package com.qf.web.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/file")
public class FileController {

    @RequestMapping("/fileUpload1")
    public String fileUpload1(MultipartFile uploadFile) throws IOException {
        System.out.println("fileUploading is running...");
        System.out.println(uploadFile);
        //1.获取原始文件的名称
        String filename = uploadFile.getOriginalFilename();
        System.out.println(filename);
        //2.为了避免多次下载的过程中出现覆盖问题 我们更改名称
        //12.png
        filename = filename.substring(0,filename.lastIndexOf(".jpg"))+ UUID.randomUUID().toString()+filename.substring(filename.lastIndexOf(".jpg"));
        //3.指定上传的位置
        File file = new File("D:\\images");
        if(!file.exists()){
            file.mkdir();
        }
        //4.上传文件
        uploadFile.transferTo(new File(file,filename));
        return "success";
    }

    @RequestMapping("/fileUpload2")
    public String fileUpload2(MultipartFile uploadFile) throws IOException {
        System.out.println("fileUploadin2 is running...");
        //1.获取原始文件的名称
        String filename = uploadFile.getOriginalFilename();
        //2.为了避免多次下载的过程中出现覆盖问题 我们更改名称
        //12.png
        filename = filename.substring(0,filename.lastIndexOf(".jpg"))+ UUID.randomUUID().toString()+filename.substring(filename.lastIndexOf(".jpg"));
        //3.指定上传的位置
        String uploadPath = "http://127.0.0.1:81/uploads";
        //4.模拟客户的进行上传
        Client client = Client.create();
        WebResource resource = client.resource(uploadPath + filename);
        String result = resource.put(String.class,uploadFile.getBytes());
        System.out.println(result);
        return "success";
    }
}
