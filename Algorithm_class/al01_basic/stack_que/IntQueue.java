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


//ť�� ������ �߰��ϴ� �޼���
    public int enqueue(int data) {
        //�����Ͱ� ���� á���� Ȯ��
        //capacity : �뷮, dataCnt : ���絥���� ��
        if (capacity <= dataCnt) {
            throw new QueueOverFlowException();
        }
        //�����͸� ť�� ��´�
        queue[rear++] = data;
        dataCnt++;

        //rear��ġ�� �������� ó���ϱ�
        if (rear == capacity) {
            rear = 0;
        } else {  }
        System.out.println("rear0->" + rear+", ���� ������ = "+dataCnt);
        return data;
    }
    //ť���� ������ ������ �޼���
    public int dequeue() throws QueueEmptyException {
        if (dataCnt <= 0) {
            throw new QueueEmptyException();
        }

        dataCnt--;
        int deData = queue[front++];
        if(front==capacity) front=0;
        System.out.println("front->" + front + ", ���� �����ͼ� = " + dataCnt);
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
//�����÷ο� �߻��� ó���� ����
class QueueOverFlowException extends RuntimeException {
    QueueOverFlowException(){}

}
