package site.luoyu.AOP;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luoyu on 2016/8/22 0022.
 */
public class ClientTest {

    @Test
    public void aopTest() throws Exception {
        Client client = new Client();
        client.AopTest();
    }

}