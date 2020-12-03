package tools;

public class Mutex {

    private boolean lock;

    public Mutex(){
        this.lock = false;
    }

    public synchronized void acquire(){
        while (this.lock){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.lock = true;
    }

    public synchronized void release(){
        this.lock = false;
        notifyAll();
    }
}
