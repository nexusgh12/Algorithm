package Algorithm.Algorithm_class.al01_basic.binarysearchtree;

import java.util.Scanner;

public class BinarySearchTreeTest {
    static Scanner s = new Scanner(System.in);


    static class Data{
        //�����͸� ���� ��ü
        private Integer no;
        private String name;

        final int NO=1; //��ȣ �Է¹����� Ȯ��
        final int NAME = 2;
        //��ȣ�� �Է¹޴� �޼ҵ�
        Integer getKeyCode(){
            return no;
        }

        public String toString(){
            return name;
        }

        //������ �Է¹޴� �޼���
        public void inData(String msg, int sw){
            System.out.print(msg+"�Է��ϼ���\n");
            if((sw&NO)==NO){
                System.out.print("��ȣ:");
                no = Integer.parseInt(s.nextLine());
            }
            if ((sw & NAME) == NAME) {
                System.out.print("�̸� : ");
                name = s.nextLine();
            }
        }//DATA
    }


    //Menu
    enum Menu{
        ADD("����"),
        REMOVE("����"),
        SEARCH("�˻�"),
        PRINT("���"),
        TERMINATOR("����");
        private final String message;

        Menu(String msg) {
            message = msg;
        }
        String getMessage(){
            return message;
        }
        //����� �Է��� �޴� ��ü�� �����ϴ� �޼���
        static Menu menuAt(int idx){
            for (Menu m : Menu.values()) {
                if (m.ordinal() == idx) {
                    return m;
                }
            }
            return null;
        }
    }//Menu
    //�޴� ����ϰ� ����ڿ��� �޴��� �Է¹��� �޼���
    //��ȯ�� : ������ �޴� ��ü
    static Menu selectMenu(){
        int menuNo;
        do {
            for (Menu m : Menu.values()) {//�޴� ���
                System.out.printf("%d.%s", m.ordinal(), m.getMessage());
            }
            System.out.println(" : ");
            menuNo = Integer.parseInt(s.nextLine());
        } while (menuNo < Menu.ADD.ordinal() || menuNo > Menu.TERMINATOR.ordinal());
        return Menu.menuAt(menuNo);
    }

    public static void main(String[] args) {
        Menu m;
        BinaryTree<Integer, Data> tree = new BinaryTree<Integer, Data>();
        Data data;
        do {
            m = selectMenu();
            switch (m) {
                case ADD:
                    data = new Data();
                    data.inData("ȸ������", data.NO|data.NAME);
                    tree.add(data.getKeyCode(), data);
                    break;
                case REMOVE:
                    data = new Data();
                    data.inData("������ key", data.NO);
                    boolean result = tree.remove(data.getKeyCode());
                    if (result) {
                        System.out.println(data.getKeyCode() + "�� ȸ���� �����Ǿ����ϴ�.");
                    } else {
                        System.out.println("ȸ�������� �����ϴ�.");
                    }
                    break;
                case SEARCH:
                    data = new Data();
                    //�˻��� ����� ��ȯ �޴´�.
                    data.inData("�˻��� key", data.NO);//key�� �����
                    //�˻��� ����� ���Ϲ޴´�
                    Data searchData = tree.search(data.getKeyCode());
                    if (searchData == null) {
                        System.out.println("�ش�Ű�� ȸ�� ������ �������� �ʽ��ϴ�.");
                    } else {//�˻��� ����� ������
                        System.out.println("��ȣ : " + searchData.getKeyCode() + ", �̸� :" + searchData);
                    }
                    break;
                case PRINT:
                    tree.print();
                    break;

            }
        } while (m != Menu.TERMINATOR);
        //���α׷��� ����ʵ�
    }
}
