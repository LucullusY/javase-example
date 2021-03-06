package thread.ProducerConsumerMode.manyToMany.lock;

/**
 * Description:
 * <br/>
 * <br/>Date:2018/9/20
 *
 * @author YangBo
 * @version 1.0
 */
public class ThreadP extends Thread {

    private ProducerConsumerLock service;

    public ThreadP(ProducerConsumerLock service){
        this.service = service;
    }

    @Override
    public void run(){
        for (int i=0; i<3; i++){
            service.setValue();
        }
    }
}
