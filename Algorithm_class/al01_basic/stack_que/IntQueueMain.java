package Algorithm.Algorithm_class.al01_basic.stack_que;

import java.util.Scanner;

public class IntQueueMain {
    static Scanner sc = new Scanner(System.in);
    static String getMenu (){
        //3. 제일 앞의 값을 구하여 출력
        //4. 큐의 크기, 데이터의 수, front index, rear 인덱스, 처음값, 마지막값을 구하라
        System.out.println("[메뉴] 0. 종료, 1. enqueue, 2. dequeue, 3. peek, 4. info");
        return sc.nextLine();
    }

    public static void main(String[] args) {


        IntQueue queue = new IntQueue(10);
        while (true) {
            String menu = getMenu();
            if (menu.equals("0")) {
                break;
            } else {
                switch (menu) {
                    case "1": //큐에 데이터를 추가한다.
                        System.out.print("큐에 추가할 데이터 : ");
                        int data = Integer.parseInt(sc.nextLine());
                        try {
                            int result = queue.enqueue(data);
                        } catch (Exception e) {
                            System.out.println("큐가 가득 찼습니다.");
                        }
                        break;
                    case "2":
                        try {
                            int result = queue.dequeue();
                            System.out.println(result);
                        } catch (Exception e) {
                            System.out.println("큐가 비어있습니다.");
                        }
                        break;
                    case "3": //제일 앞에 있는 데이터 가져오기
                        try {
                            int result = queue.peek();
                            System.out.println("큐의 제일 앞 데이터 -> " + result);
                        } catch (Exception e) {
                            System.out.println("큐가 비어있습니다.");
                        }
                        break;
                    case "4":
                        System.out.println("큐의 크기->" + queue.getCapacity());
                        System.out.println("데이터의 수->" + queue.getSize());
                        System.out.println("front->" + queue.getFrontIndex());
                        System.out.println("rear->" + queue.getRearIndex());
                        System.out.println("처음 값->" + queue.peek());
                        System.out.println("마지막 값->" + queue.getRearData());
                        break;
                    default:
                        System.out.println("메뉴를 잘못 선택 하였습니다.");

                }
            }

        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
