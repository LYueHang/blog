package demo.tyh.service.base.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import demo.tyh.service.base.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    public int insertUser(User user);
}
