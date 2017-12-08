package test;

import org.apache.log4j.Logger;

public class log4jTest {

    //获取日志记录器Logger，名字为本类类名
    private static Logger log = Logger.getLogger(log4jTest.class);

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            log.debug("HellWord");
        }
    }

}
