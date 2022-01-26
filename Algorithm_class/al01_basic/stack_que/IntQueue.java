package Algorithm.Algorithm_class.al01_basic.stack_que;

public class IntQueue {
    int capacity;
    int queue[];

    int front;
    int rear;
    int dataCnt;

    public IntQueue(){

    }

    public IntQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = 0;
        dataCnt = 0;

    }


//큐에 데이터 추가하는 메서드
    public int enqueue(int data) {
        //데이터가 가득 찼는지 확인
        //capacity : 용량, dataCnt : 현재데이터 수
        if (capacity <= dataCnt) {
            throw new QueueOverFlowException();
        }
        //데이터를 큐에 담는다
        queue[rear++] = data;
        dataCnt++;

        //rear위치를 링형으로 처리하기
        if (rear == capacity) {
            rear = 0;
        } else {  }
        System.out.println("rear0->" + rear+", 남은 데이터 = "+dataCnt);
        return data;
    }
    //큐에서 데이터 얻어오는 메서드
    public int dequeue() throws QueueEmptyException {
        if (dataCnt <= 0) {
            throw new QueueEmptyException();
        }

        dataCnt--;
        int deData = queue[front++];
        if(front==capacity) front=0;
        System.out.println("front->" + front + ", 남은 데이터수 = " + dataCnt);
        return deData;
    }
    public int peek() throws QueueEmptyException{
        if (dataCnt <= 0) {
            throw new QueueEmptyException();
        }
        return queue[front];
    }

    public int getCapacity() {
        return capacity;
    }
    public int getSize(){
        return dataCnt;
    }
    public int getFrontIndex(){
        return front;
    }
    public int getRearIndex() {
        return rear;
    }
    public int getRearData() {
        return queue[rear-1];
    }

}


class QueueEmptyException extends RuntimeException {
    QueueEmptyException(){}
}
//오버플로우 발생시 처리할 예외
class QueueOverFlowException extends RuntimeException {
    QueueOverFlowException(){}

}
