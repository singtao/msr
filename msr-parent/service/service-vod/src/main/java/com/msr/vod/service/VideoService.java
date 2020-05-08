package com.msr.vod.service;

import org.springframework.web.multipart.MultipartFile;

public interface VideoService {
    /**
     * 视频上传
     * @param file
     * @return  返回视频的ID
     */
    String uploadVideo(MultipartFile file);

    void removeVideo(String videoId);
}
