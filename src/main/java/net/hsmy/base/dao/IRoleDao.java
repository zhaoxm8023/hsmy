package net.hsmy.base.dao;

import net.hsmy.base.dao.support.IBaseDao;
import net.hsmy.base.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import net.hsmy.base.dao.support.IBaseDao;
import net.hsmy.base.entity.Role;

@Repository
public interface IRoleDao extends IBaseDao<Role, Integer> {

	Page<Role> findAllByNameContainingOrDescriptionContaining(String searchText1, String searchText2, Pageable pageable);

}
