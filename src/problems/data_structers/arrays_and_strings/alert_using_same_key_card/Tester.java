package problems.data_structers.arrays_and_strings.alert_using_same_key_card;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private final Solution _s;

    public Tester(){
        this._s = new Solution();
    }

    @Test
    public void test1(){
        String[] keyName = {"daniel","daniel","daniel","luis","luis","luis","luis"};
        String[] keyTime = {"10:00","10:40","11:00","09:00","11:00","13:00","15:00"};
        String[] res = {"daniel"};
        assertEquals(Arrays.asList(res), this._s.alertNames(keyName, keyTime));
    }

    @Test
    public void test2(){
        String[] keyName = {"alice","alice","alice","bob","bob","bob","bob"};
        String[] keyTime = {"12:01","12:00","18:00","21:00","21:20","21:30","23:00"};
        String[] res = {"bob"};
        assertEquals(Arrays.asList(res), this._s.alertNames(keyName, keyTime));
    }

    @Test
    public void test3(){
        String[] keyName = {"john","john","john"};
        String[] keyTime = {"23:58","23:59","00:01"};
        String[] res = {};
        assertEquals(Arrays.asList(res), this._s.alertNames(keyName, keyTime));
    }

    @Test
    public void test4(){
        String[] keyName = {"leslie","leslie","leslie","clare","clare","clare","clare"};
        String[] keyTime = {"13:00","13:20","14:00","18:00","18:51","19:30","19:49"};
        String[] res = {"clare","leslie"};
        assertEquals(Arrays.asList(res), this._s.alertNames(keyName, keyTime));
    }
}
