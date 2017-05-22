package mybatis_learn.mapper;

import mybatis_learn.pojo.Clip;
import org.apache.ibatis.annotations.Select;

/**
 * Created by fupeng on 2017/5/22.
 */
public interface Clip3_Mapper {

    @Select("select * from entity_res_clip where id = #{id}")
    public Clip getClip(int id);

}
