package Algorithm.Algorithm_class.al01_basic.binarysearchtree;

import java.util.Scanner;

public class BinarySearchTreeTest {
    static Scanner s = new Scanner(System.in);


    static class Data{
        //데이터를 담을 객체
        private Integer no;
        private String name;

        final int NO=1; //번호 입력받을지 확인
        final int NAME = 2;
        //번호를 입력받는 메소드
        Integer getKeyCode(){
            return no;
        }

        public String toString(){
            return name;
        }

        //데이터 입력받는 메서드
        public void inData(String msg, int sw){
            System.out.print(msg+"입력하세요\n");
            if((sw&NO)==NO){
                System.out.print("번호:");
                no = Integer.parseInt(s.nextLine());
            }
            if ((sw & NAME) == NAME) {
                System.out.print("이름 : ");
                name = s.nextLine();
            }
        }//DATA
    }


    //Menu
    enum Menu{
        ADD("삽입"),
        REMOVE("삭제"),
        SEARCH("검색"),
        PRINT("출력"),
        TERMINATOR("종료");
        private final String message;

        Menu(String msg) {
            message = msg;
        }
        String getMessage(){
            return message;
        }
        //사용자 입력한 메뉴 객체를 리턴하는 메서드
        static Menu menuAt(int idx){
            for (Menu m : Menu.values()) {
                if (m.ordinal() == idx) {
                    return m;
                }
            }
            return null;
        }
    }//Menu
    //메뉴 출력하고 사용자에게 메뉴를 입력받은 메서드
    //반환형 : 선택한 메뉴 객체
    static Menu selectMenu(){
        int menuNo;
        do {
            for (Menu m : Menu.values()) {//메뉴 출력
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
                    data.inData("회원정보", data.NO|data.NAME);
                    tree.add(data.getKeyCode(), data);
                    break;
                case REMOVE:
                    data = new Data();
                    data.inData("삭제할 key", data.NO);
                    boolean result = tree.remove(data.getKeyCode());
                    if (result) {
                        System.out.println(data.getKeyCode() + "번 회원이 삭제되었습니다.");
                    } else {
                        System.out.println("회원정보가 없습니다.");
                    }
                    break;
                case SEARCH:
                    data = new Data();
                    //검색한 결과를 반환 받는다.
                    data.inData("검색할 key", data.NO);//key가 저장됨
                    //검색한 결과를 리턴받는다
                    Data searchData = tree.search(data.getKeyCode());
                    if (searchData == null) {
                        System.out.println("해당키의 회원 정보는 존재하지 않습니다.");
                    } else {//검색한 결과가 있을때
                        System.out.println("번호 : " + searchData.getKeyCode() + ", 이름 :" + searchData);
                    }
                    break;
                case PRINT:
                    tree.print();
                    break;

            }
        } while (m != Menu.TERMINATOR);
        //프로그램이 종료됨됨
    }
}
