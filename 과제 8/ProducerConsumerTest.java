import java.util.Scanner;

public class ProducerConsumerTest {

    public static void main(String[] args) {

        MBuffer buffer = new MBuffer();
        MProducer prod = new MProducer(buffer);
        MConsumer cons1 = new MConsumer(buffer, "C1", 1000);
        MConsumer cons2 = new MConsumer(buffer, "C2", 2000);
        Thread Producer = (new Thread(prod));
        Thread Consumer1 = (new Thread(cons1));
        Thread Consumer2 = (new Thread(cons2));
        Producer.setDaemon(true);
        Consumer1.setDaemon(true);
        Consumer2.setDaemon(true);
        Producer.start();
        Consumer1.start();
        Consumer2.start();
        
        Scanner sc = new Scanner(System.in);
        while(true){
        String setmode = sc.nextLine();
        if("q".equals(setmode)) {
            System.out.println("[Admin] 종료하겠습니다.");
            System.out.println("생산자 종료. 총 생산 케익 개수 :" + prod.HowManyWorks);
            System.out.println("소비자: [" + cons1.name + "] : 종료." + "HowManyWorks=" + cons1.HowManyWorks + "TotalWorkTimes:" + cons1.TotalWorkTimes);
            System.out.println("소비자: [" + cons2.name + "] : 종료." + "HowManyWorks=" + cons2.HowManyWorks + "TotalWorkTimes:" + cons2.TotalWorkTimes);
            System.out.println("Admin] producer와 consumer 모두 종료하였습니다. 미처리 작업 개수:"+buffer.getsize(buffer.data));
            break;
        } else {
            System.out.println("[Admin] 알지 못하는 명령어입니다.");
        }
        }
        }

    }


class MBuffer {

    int[] data = new int[5];
    private boolean empty = true;

    /**
     *
     * @return last data of data-array
     */
    public synchronized int get() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        empty = true;
        int cake = 0;
        for (int i = 4; i >= 0; i--) {
            if (data[i] != 0) {
                cake = i;
                break;
            }
        }
        notifyAll();
        int getcake = data[cake];
        data[cake] = 0;
        return getcake;
    }

    /**
     * put data into data-array
     *
     * @param data
     */
    public synchronized void put(int data) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        empty = false;
        for (int i = 0; i < 5; i++) {
            if (this.data[i] == 0) {
                this.data[i] = data;
                break;
            }
        }
        notifyAll();
        
      
        }
    public int getsize(int[] arr){
        int size=0;
        for(int i=0;i<arr.length;i++){
            if(data[i]!=0)
                size++;
    }
        return size;
        
}
}

class MProducer implements Runnable {

    private MBuffer buffer;
    int HowManyWorks = 0;

    public MProducer(MBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int i = 0;
        while(true){
        

            buffer.put(i);
            i = i + 1;
            System.out.println("생산자 " + i + "번째 케익을 생산하였습니다.");
            HowManyWorks++;
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
    }
            
       

    }



class MConsumer implements Runnable {

    private MBuffer buffer;
    private int WorkLimitTime;
    int HowManyWorks;
    int TotalWorkTimes;
    String name;
    

    public MConsumer(MBuffer drop, String _name, int _WorkLimitTime) {
        this.buffer = drop;
        this.name = _name;
        this.WorkLimitTime = _WorkLimitTime;
        this.HowManyWorks = 0;
    }

    public void run() {
        
        while(true){
            int data = buffer.get();
            int currentWorkTime = (int) (Math.random() * WorkLimitTime);
            System.out.println("소비자[" + name + "] :" + data + "번 케익을 소비하였습니다." + "소요시간 :" + currentWorkTime);
            HowManyWorks++;
            TotalWorkTimes += currentWorkTime;
            try {
                Thread.sleep(currentWorkTime);
            } catch (InterruptedException e) {
            }
        }
        

    }

}
