package com.rakshith.filedemo.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

    // Upload API

    @PostMapping(value = "/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)

    public String uploadFile(@RequestParam("file") MultipartFile file)
            throws IOException {

        File folder = new File("D:/");

        if (!folder.exists()) {
            folder.mkdirs();
        }

        File uploadFile =
                new File(folder, file.getOriginalFilename());

        FileOutputStream fos =
                new FileOutputStream(uploadFile);

        fos.write(file.getBytes());

        fos.close();

        return "File Uploaded Successfully";

    }


    // Download API

    @GetMapping("/download")

    public ResponseEntity<Resource> downloadFile()
            throws IOException {

        File file =
                new File("D:/Rakshith_Resume (6).pdf");

        InputStreamResource resource =
                new InputStreamResource(
                        new FileInputStream(file));

        return ResponseEntity.ok()

                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=" + file.getName())

                .contentLength(file.length())

                .contentType(MediaType.APPLICATION_OCTET_STREAM)

                .body(resource);

    }

}