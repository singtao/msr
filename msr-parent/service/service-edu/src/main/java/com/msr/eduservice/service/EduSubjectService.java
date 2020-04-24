package com.msr.eduservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.eduservice.entity.EduSubject;
import com.msr.eduservice.entity.subject.OneSubject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author msr
 * @since 2020-04-23
 */
public interface EduSubjectService extends IService<EduSubject> {
    //添加课程分类的方法
    void saveSubject(MultipartFile file, EduSubjectService subjectService);

    //课程分类列表（树形）
    List<OneSubject> getAllOneTwoSubject();
}
