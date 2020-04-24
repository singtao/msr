package com.msr.oss.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 文件的上传
 */
public interface FileService {
    /**
     * 文件上传至阿里云
     * @param file   图片、音频、视频
     * @return   文件上传到OSS中的路径
     */
    String upload(MultipartFile file);
}
