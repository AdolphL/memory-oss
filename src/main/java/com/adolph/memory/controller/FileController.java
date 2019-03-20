package com.adolph.memory.controller;

import com.adolph.memory.service.FileService;
import com.adolph.memory.service.impl.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@RestController
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping("/{userId}/upload")
    public String upload(@PathVariable @NotBlank String userId, @NotNull MultipartFile file) {

        return null;
    }

    @GetMapping("/{userId}/download")
    public void download(@PathVariable @NotBlank String userId, @NotNull HttpServletResponse response) {

    }

}
