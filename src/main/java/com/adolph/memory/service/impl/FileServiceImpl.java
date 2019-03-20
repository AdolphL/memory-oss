package com.adolph.memory.service.impl;

import com.adolph.memory.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * linux file system implements(standalone).
 *
 * @author adolph liu
 * 2019-3-20 18:58:32
 */
@Service
public class FileServiceImpl implements FileService {

    @Override
    public String saveFile(String userId, MultipartFile file) {

        return null;
    }

    @Override
    public void findFile(String userId, String fileIndex) {

    }

}
