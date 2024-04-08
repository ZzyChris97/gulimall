package com.zzy.gulimall.member.dao;

import com.zzy.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zzy
 * @email 153730598@qq.com
 * @date 2024-04-09 00:33:47
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
