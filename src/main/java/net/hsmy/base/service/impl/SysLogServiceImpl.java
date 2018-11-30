package net.hsmy.base.service.impl;

import net.hsmy.base.dao.SysLogDao;
import net.hsmy.base.dao.SysLog;
import net.hsmy.base.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : HejinYo   hejinyo@gmail.com
 * @date : 2017/6/12 22:31
 * @Description :
 */
@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogDao sysLogDao;

    @Override
    public void save(SysLog sysLog) {
        sysLogDao.save(sysLog);
    }

    @Override
    public List<SysLog> list() {
        return sysLogDao.listPage("");
    }
}
