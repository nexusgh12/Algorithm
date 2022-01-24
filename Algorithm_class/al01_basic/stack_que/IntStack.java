package Algorithm.Algorithm_class.al01_basic.stack_que;

public class IntStack {
    int capacity; //최대로 저장할 수 있는 객체의 수
    int stk[]; //정수를 저장할 수 있는 배열을 생성
    int point; //stack의 채워진 값의 위치 +1
    IntStack(){}
    IntStack(int max){
        capacity = max;//값을 저장할 수 있는 크기
        point = 0;

        stk = new int[max];

    }
    //데이터의 수를 리턴하는 메소드
    public int getSize(){
        return point;
    }
    public int getCapacity(){
        return capacity;
    }
    //스택에 데이터를 추가하는 메서드
    public int push(int data) throws OverflowIntStackException{
        if (point >= capacity) {
            throw new OverflowIntStackException();
        }

        return stk[point++] = data;
    }
    //오버플로우 발생시 예외처리 클래스

    public int pop() throws EmptyIntStackException{
        if(point<= 0){
            throw new EmptyIntStackException();
        }
        return stk[--point];
    }

    public int peek() throws EmptyIntStackException{
        if(point<=0){
            throw new EmptyIntStackException();
        }
        return stk[point-1];
    }

    public void print(){
        if (point <= 0) {
            System.out.println("스택이 비어 있습니다.");

        } else {
            for (int i = 0; i < point; i++) {
                System.out.println("stk[" + i + "] = " + stk[i]);
            }
        }

    }

    public int IndexOf(int search) {
        for (int i = point - 1; i <= 0; i++) {
            if (stk[i]==search) {
                return i;
            }
        }
        return -1;
    }

    //   스택에 데이터가 존재하는지 확인하는 메소드
    public boolean isEmpty() {
        //   비어있으면 true, 데이터가 있으면 false
        //   return (point<=0)? true:false;
        return point<=0;
    }

    public boolean isFull(){
        return point>=capacity;
    }
}
class OverflowIntStackException extends RuntimeException{
    public OverflowIntStackException(){ };
}
class EmptyIntStackException extends RuntimeException{
    public EmptyIntStackException(){};
}
