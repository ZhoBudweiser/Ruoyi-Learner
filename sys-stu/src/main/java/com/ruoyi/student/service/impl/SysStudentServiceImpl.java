package com.ruoyi.student.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.student.domain.SysStudent;
import com.ruoyi.student.mapper.SysStudentMapper;
import com.ruoyi.student.service.ISysStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysStudentServiceImpl implements ISysStudentService {

    @Autowired
    private SysStudentMapper sysStudentMapper;

    @Override
    public SysStudent selectSysStudentByStudentId(Long studentId) {
        return sysStudentMapper.selectSysStudentByStudentId(studentId);
    }

    @Override
    public List<SysStudent> selectSysStudentList(SysStudent sysStudent) {
        return sysStudentMapper.selectSysStudentList(sysStudent);
    }

    @Override
    public int insertSysStudent(SysStudent sysStudent) {
        return sysStudentMapper.insertSysStudent(sysStudent);
    }

    @Override
    public int updateSysStudent(SysStudent sysStudent) {
        return sysStudentMapper.updateSysStudent(sysStudent);
    }

    @Override
    public int deleteSysStudentByStudentIds(String studentIds) {
        return sysStudentMapper.deleteSysStudentByStudentIds(Convert.toStrArray(studentIds));
    }

    @Override
    public int deleteSysStudentByStudentId(Long studentId) {
        return sysStudentMapper.deleteSysStudentByStudentId(studentId);
    }
}
