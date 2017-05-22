package mybatis_learn;

import mybatis_learn.mapper.Clip2_Mapper;
import mybatis_learn.mapper.Clip3_Mapper;
import mybatis_learn.pojo.Clip;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by fupeng on 2017/5/22.
 */
public class MainTest {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();


        try {
            //方式一 worked
            Clip clip = session.selectOne("ClipMapper.selectClip", 1);

            System.out.println(clip);


            //方式二

            Clip2_Mapper mapper = session.getMapper(Clip2_Mapper.class);
            Clip clip2 = mapper.getClip(2);

            System.out.println(clip2);

            //方式三
            Clip3_Mapper mapper3 = session.getMapper(Clip3_Mapper.class);
            Clip clip3 = mapper3.getClip(3);

            System.out.println(clip3);

        }finally {
            session.close();
        }



    }
}
