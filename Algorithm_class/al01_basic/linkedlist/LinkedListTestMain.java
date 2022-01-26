package Algorithm.Algorithm_class.al01_basic.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListTestMain {
    static Scanner scan = new Scanner(System.in);

    //��ȭ�� �̸��� �����Ҽ� �ִ� ����Ŭ����
    static class Data{
        private Integer no;
        private String name;

        static final int NO = 1;//��ȣ�� �Է¹����� Ȯ��
        static final int NAME = 2;

        //String �������� ���� ��ȯ
        public String toString() {
            return no+" : "+name;
        }
        //��ȣ �Ǵ� �Է¹��� �޼���
        public void scanData(String msg,int s) {
            //s���� 1,2,3�߿� �ϳ��� ��
            if((s & NO)==NO){
                System.out.print("��ȣ : ");
                no = scan.nextInt();
            }
            if ((s & NAME) == NAME) {
                System.out.print("�̸� : ");
                name = scan.next();

            }
        }
    }

    //�޴��� ���������� �����
    enum Menu{
        ADD_FIRST("�Ӹ��� ��� ����"),
        ADD_LAST("������ ��� ����"),
        REMOVE_FIRST("�Ӹ� ��� ����"),
        REMOVE_CURRENT("������ ��� ����"),
        DUMP("��� ��� ���"),
        TERMINATE("����");

        private final String message;

        static Menu MenuAt(int idx) {
            for (Menu m:Menu.values()) {
                if(m.ordinal()==idx)
                    return m;
            }
            return null;
        }
        Menu(String str) {
            message = str;
        }
        String getMessage() {
            return message;
        }
    }
    //�޴��� ǥ���ϰ� �޴��� index�� �Է¹޾� ������ �޴���ü �����ϴ� �޼ҵ�
    static Menu SelectMenu() {
        int key;
        do {
            for(Menu m:Menu.values()) {
                System.out.printf("(%d) %s ",m.ordinal(),m.getMessage());
            }
            System.out.print("->");
            key = scan.nextInt();
        }while(key<Menu.ADD_FIRST.ordinal() || key>Menu.TERMINATE.ordinal());

        return Menu.MenuAt(key);
    }


    public static void main(String[] args) {
        Menu menu;
        LinkedListTest<Data> list = new LinkedListTest<Data>();

        do {
            //�޴��� ǥ��
            Data data;
            menu = SelectMenu();
            switch(menu) {
                case ADD_FIRST://�Ӹ��� ��� ����
                    data = new Data();
                    data.scanData("�Ӹ���� ����",Data.NO | Data.NAME);
                    //List�� ����
                    list.addFirst(data);
                    break;
                case ADD_LAST://������ ��� ����
                    data = new Data();
                    data.scanData("������� ����",Data.NO | Data.NAME);
                    list.addLast(data);
                    break;
                case REMOVE_FIRST://�Ӹ� ��� ����
                    list.removeFirst();
                    break;
                case REMOVE_CURRENT://���� ��� ����
                    list.removeCurrent();
                    break;
                case DUMP://��ü ���
                    list.dump();
                    break;
            }
        }while(menu !=Menu.TERMINATE);
        System.out.println("���α׷��� ����Ǿ����ϴ�.");
    }
}
