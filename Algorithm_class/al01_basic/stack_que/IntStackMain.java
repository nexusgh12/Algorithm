package Algorithm.Algorithm_class.al01_basic.stack_que;

import java.util.Scanner;

public class IntStackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("stack의 크기 입력-> ");
        int max = sc.nextInt();
        IntStack stack = new IntStack(max);
        while (true) {
            //현재 스택의 데이터 개수와 스택의 크기를 출력하고
            System.out.print("데이터의 수 -> " + stack.getSize());
            System.out.println(", 메모리 크기 -> " + stack.getCapacity());
            //메뉴 표시 : push, pop, peek, print, search, empty, stack 정보표시, 종료
            System.out.println("[메뉴]0. 종료, 1.push, 2. pop, 3. peek, 4. print, 5. indexOf, 6. isEmpty");

            int menu = sc.nextInt();
            if(menu == 0) break;

            //괄호에 들어올 수 있는 것 변수, 수식, 상수 -> int, char, String
            switch (menu){
                case 1://스택에 값을 추가한다.
                    System.out.print("스택에 추가할 데이터 ->");
                    int data = sc.nextInt();
                    try {
                        stack.push(data);
                    } catch (OverflowIntStackException oise) {
                        System.out.println("스택이 가득 찼습니다.");

                    }
                    break;
                case 2:
                    try {
                        int result = stack.pop();
                        System.out.println("스택에서 "+result+"값을 pop() 했습니다.");
                    } catch (EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 3:
                    try {
                        int result = stack.peek();
                        System.out.println("현재 제일 위의 값은 " + result + "입니다.");
                    } catch (EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                case 4:
                    stack.print();
                    break;

                case 5:
                    System.out.print("검색할 데이터");
                    int search = sc.nextInt();
                    int idx = stack.IndexOf(search);
                    if (idx >= 0) {
                        System.out.println(search + "는 스택의 " + idx + "위치에 존재합니다.");
                    } else {
                        System.out.println(search + "는 스택에 없습니다.");
                    }
                    break;
                case 6:
                    if (stack.isEmpty()) {
                        System.out.println("스택에 데이터가 비어있습니다..");
                    } else {
                        System.out.println("스택에 데이터가 있습니다..");
                    }
                    break;
                case 7: //스택 정보표시
                    //스택의 크기
                    System.out.println("스택의 크기 : " + stack.getCapacity());
                    //데이터 갯수
                    System.out.println("데이터의 갯수 : " + stack.getSize());
                    //비어있는지 확인
                    System.out.println("데이터 존재 유무  : " + ((stack.isEmpty())? "비어있음":"데이터있음"));
                    //가득찼는지 확인
                    System.out.println("데이터 full 유무  : " + ((stack.isFull())? "가득참":"여유가 있음"));

            }

        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
