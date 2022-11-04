package com.ruoyi.student.mapper;

import com.ruoyi.student.domain.SysStudent;

import java.util.List;

public interface SysStudentMapper {
    public SysStudent selectStudentByStudentId(Long studentId);

    public List<SysStudent> selectSysStudentList(SysStudent sysStudent);

    public int updateSysStudent(SysStudent sysStudent);

    public int deleteSysStudentByStudentId(Long studentId);

    public int deleteSysStudentByStudentIds(String[] studentIds);
}
