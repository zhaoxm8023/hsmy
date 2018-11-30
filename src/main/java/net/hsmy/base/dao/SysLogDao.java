package net.hsmy.base.dao;

import net.hsmy.base.dao.BaseDao;
import net.hsmy.base.dao.SysLog;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

/**
 * @author : HejinYo   hejinyo@gmail.com
 * @date : 2017/6/17 16:54
 * @Description :
 */
@Mapper
public interface SysLogDao {
    public List<SysLog> listPage(String id);
    void save(SysLog record);
}
