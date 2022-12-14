package com.ruoyi.student.mapper;

import com.ruoyi.student.domain.SysStudent;

import java.util.List;

public interface SysStudentMapper {
    public SysStudent selectSysStudentByStudentId(Long studentId);

    public List<SysStudent> selectSysStudentList(SysStudent sysStudent);

    public int updateSysStudent(SysStudent sysStudent);

    public int deleteSysStudentByStudentId(Long studentId);

    public int deleteSysStudentByStudentIds(String[] studentIds);

    public int insertSysStudent(SysStudent sysStudent);
}
