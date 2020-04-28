package com.msr.eduservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.eduservice.entity.EduChapter;
import com.msr.eduservice.entity.vo.ChapterVo;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author msr
 * @since 2020-04-24
 */
public interface EduChapterService extends IService<EduChapter> {
    List<ChapterVo> nestedList(String courseId);

    boolean removeChapterById(String id);
}
