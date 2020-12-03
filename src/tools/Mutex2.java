package tools;

import java.util.concurrent.atomic.AtomicBoolean;

public class Mutex2 {

    private AtomicBoolean lock;

    public Mutex2(){
        this.lock = new AtomicBoolean(false);
    }

    public void acquire(){
        while (this.lock.compareAndExchange(false, true));
    }

    public void release(){
        this.lock.set(false);
    }
}
