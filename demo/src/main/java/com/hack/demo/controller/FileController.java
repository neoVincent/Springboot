package com.hack.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;

@Controller
public class FileController {

    final Logger log = LoggerFactory.getLogger(FileController.class);

    @RequestMapping(value="/gouploadimg", method = RequestMethod.GET)
    public String goUploadimg() {
        return "uploadimg";
    }

    @RequestMapping(value = "/testuploadimg", method = RequestMethod.POST)
    @ResponseBody
    public String uploadimg(@RequestParam("file")MultipartFile file, HttpServletRequest request) {
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        String filePath = request.getSession().getServletContext().getRealPath("imgupload/");
        log.info("fileName --> " + fileName);
        log.info("getContentType --> " + contentType);
        log.info("File path --> " + filePath);
        try {
            File targetFile = new File(filePath);
            if (!targetFile.exists()) {
                targetFile.mkdirs();
            }
            FileOutputStream out = new FileOutputStream(filePath + fileName);
            out.write(file.getBytes());
            out.flush();
            out.close();
        }catch (Exception e) {
            log.error(e.getMessage());
        }

        return "upload success";
    }
}
