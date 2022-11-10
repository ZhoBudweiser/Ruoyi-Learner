package com.ruoyi.student.service;

import com.ruoyi.student.domain.SysStudent;

import java.util.List;

public interface ISysStudentService {
    public SysStudent selectSysStudentByStudentId(Long studentId);

    public List<SysStudent> selectSysStudentList(SysStudent sysStudent);

    public int insertSysStudent(SysStudent sysStudent);

    public int updateSysStudent(SysStudent sysStudent);

    public int deleteSysStudentByStudentIds(String studentIds);

    public int deleteSysStudentByStudentId(Long studentId);
}
