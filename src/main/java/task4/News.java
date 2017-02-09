package task4;

/**
 * Created by Administrator on 2/8/2017.
 */
public class News {
    public static final int NUMBER = 10;

    public static int countPage(int news) {

        return news / NUMBER + 1;
    }
}
