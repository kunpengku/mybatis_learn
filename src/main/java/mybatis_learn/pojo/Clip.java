package mybatis_learn.pojo;

/**
 * Created by fupeng on 2017/5/22.
 */
public class Clip {
    private long id;
    private String resource_name;

    @Override
    public String toString() {
        return "Clip{" +
                "id=" + id +
                ", name='" + resource_name + '\'' +
                '}';
    }
}
