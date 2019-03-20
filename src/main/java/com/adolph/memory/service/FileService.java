package com.adolph.memory.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * File oss save and get.
 *
 * @author adolph liu
 * 2019-3-20 18:54:32
 */
public interface FileService {

    /**
     * save file by user id.
     *
     * @param userId user id
     * @param file file oss
     * @return file index
     */
    String saveFile(String userId, MultipartFile file);

    /**
     * find file by user id and file index.
     *
     * @param userId user id
     * @param fileIndex file index
     */
    void findFile(String userId, String fileIndex);

}
