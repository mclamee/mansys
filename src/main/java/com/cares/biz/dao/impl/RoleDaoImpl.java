package com.cares.biz.dao.impl;

import com.cares.biz.dao.RoleDao;
import com.cares.biz.entity.RoleVO;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDaoImpl<RoleVO, Long> implements RoleDao {

    protected RoleDaoImpl() {
        super(RoleVO.class);
    }


    @Override
    public RoleVO createRole(RoleVO role) {
        save(role);
        return role;
    }

    @Override
    public RoleVO updateRole(RoleVO role) {
        update(role);
        return role;
    }

    @Override
    public void deleteRole(Long roleId) {
        delete(findOne(roleId));
    }

    @Override
    public RoleVO findOne(Long roleId) {
        return findById(roleId);
    }


}
