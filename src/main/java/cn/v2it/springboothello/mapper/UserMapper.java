package cn.v2it.springboothello.mapper;

import cn.v2it.springboothello.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: xqq
 * @Date: 2019/3/17 02:55
 * @Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
