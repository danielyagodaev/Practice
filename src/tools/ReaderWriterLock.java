package tools;

public class ReaderWriterLock {

    private static ReaderWriterLock instance = null;

    private final Mutex2 readersMutex;
    private final Mutex2 readerWriterMutex;
    private int readersCount;

    public static ReaderWriterLock getInstance(){
        if (instance == null){
            instance = new ReaderWriterLock();
        }
        return instance;
    }

    private ReaderWriterLock(){
        this.readersMutex = new Mutex2();
        this.readerWriterMutex = new Mutex2();
        this.readersCount = 0;
    }

    public void readerStart(){
        this.readersMutex.acquire();
        this.readersCount++;
        if (this.readersCount == 1){
            this.readerWriterMutex.acquire();
        }
        this.readersMutex.release();
    }

    public void readerEnd(){
        this.readersMutex.acquire();
        this.readersCount--;
        if (this.readersCount == 0){
            this.readerWriterMutex.release();
        }
        this.readersMutex.release();
    }

    public void writerStart(){
        this.readerWriterMutex.acquire();
    }

    public void writerEnd(){
        this.readerWriterMutex.release();
    }

}
