package Algorithm.Algorithm_class.al01_basic.stack_que;

import java.util.Scanner;

public class IntQueueMain {
    static Scanner sc = new Scanner(System.in);
    static String getMenu (){
        //3. ���� ���� ���� ���Ͽ� ���
        //4. ť�� ũ��, �������� ��, front index, rear �ε���, ó����, ���������� ���϶�
        System.out.println("[�޴�] 0. ����, 1. enqueue, 2. dequeue, 3. peek, 4. info");
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
                    case "1": //ť�� �����͸� �߰��Ѵ�.
                        System.out.print("ť�� �߰��� ������ : ");
                        int data = Integer.parseInt(sc.nextLine());
                        try {
                            int result = queue.enqueue(data);
                        } catch (Exception e) {
                            System.out.println("ť�� ���� á���ϴ�.");
                        }
                        break;
                    case "2":
                        try {
                            int result = queue.dequeue();
                            System.out.println(result);
                        } catch (Exception e) {
                            System.out.println("ť�� ����ֽ��ϴ�.");
                        }
                        break;
                    case "3": //���� �տ� �ִ� ������ ��������
                        try {
                            int result = queue.peek();
                            System.out.println("ť�� ���� �� ������ -> " + result);
                        } catch (Exception e) {
                            System.out.println("ť�� ����ֽ��ϴ�.");
                        }
                        break;
                    case "4":
                        System.out.println("ť�� ũ��->" + queue.getCapacity());
                        System.out.println("�������� ��->" + queue.getSize());
                        System.out.println("front->" + queue.getFrontIndex());
                        System.out.println("rear->" + queue.getRearIndex());
                        System.out.println("ó�� ��->" + queue.peek());
                        System.out.println("������ ��->" + queue.getRearData());
                        break;
                    default:
                        System.out.println("�޴��� �߸� ���� �Ͽ����ϴ�.");

                }
            }

        }
        System.out.println("���α׷��� ����Ǿ����ϴ�.");
    }
}
