package Algorithm.Algorithm_class.al01_basic.binarysearchtree;
import java.util.Comparator;

public class BinaryTree<K, V> {
    //객체 1개를 저장할 노드클래스
    // key, Data
    static class Node<K, V>{
        private K key; //key
        private V data; //data
        private Node<K, V> left; //왼쪽노드
        private Node<K, V> right; //오른쪽 노드

        Node(K key, V data, Node<K, V> left,
             Node<K, V> right){
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }
        //키
        K getKey(){
            return key;
        }
        //데이터
        V getValue() {
            return data;
        }

        //출력
        void print(){
            System.out.println();
        }

    }//Node

    private Node<K, V> root;//루트 노드

    BinaryTree(){
        root = null; //루트 노드 초기화
    }

    public int comp(K key1, K key2) {
        return ((Comparable<K>)key1).compareTo(key2);
    }
    public void addNode(Node<K, V> node, K key, V data){
        int result = comp(key, node.getKey());
        if (result == 0) {//이미 있는 키값일때
            return;
        } else if (result < 0) {//왼쪽 노드를 탐색
            if (node.left==null) {// node의 왼쪽이 비어있으면, 새로운 노드를 node 왼쪽에 추가
                node.left = new Node<K, V>(key, data, null, null);
            } else {
                addNode(node.left, key, data);
            }
        } else {//양수 : 오른쪽 노드를 검색
            if (node.right == null) {
                node.right = new Node<K, V>(key, data, null, null);

            } else {
                addNode(node.right, key, data);
            }
        }
    }
    public void add(K key, V data) {

        if (root == null) {
            //루트가 비어있으면 data를 노드를 만들어 root에 대입하면된다.
            root = new Node<K, V>(key, data, null, null);
        } else {
            //루트가 비어있지 않으면 key를 이용하여 위치를 찾아서 추가해야한다.
            addNode(root, key, data);
        }

    }

    //노드 삭제
    public boolean remove(K key) {

        Node<K, V> point = root; //root
        Node<K, V> parent = null; //부모
        boolean isLeftChild = true; //왼쪽, 오른쪽 노드인지의 정보가 필요함

        while (true) {
            if (point == null) {//point가 null이면 노드가 존재하지 않는다
                return false;
            }

            // 삭제할 노드 찾기
            int cond = comp(key, point.getKey()); // 양수 -> 오른쪽 검색
            if (cond == 0) {//검색할 노드 찾음.
                break;
            } else if (cond < 0) {
                point = point.left;
                isLeftChild = true;
            } else {
                point = point.right;
                isLeftChild = false;
            }


        }
        // 부모노드, 삭제할 노드 정해짐
        //left노드가 없을 떄 (삭제할 노드의 right를 부모 노드의 left에 대입한다)
        if (point.left == null) {
            //삭제할 노드가 root이면 오른쪽 노드를 root
            if (point == root) {
                root = point.right;
            } else if (isLeftChild) {
                parent.left = point.right;
            } else {
                parent.right = point.right;
            }
        } else if (point.right == null) {
            if (point == root) {
                root = point.left;
            } else if (isLeftChild) {
                parent.left = point.left;

            } else {
                parent.right = point.left;
            }
        } else {
            parent = point;
            Node<K, V> maxNode = point.left;
            isLeftChild = true;
            while (maxNode.right != null) {
                parent = maxNode;
                maxNode = maxNode.right;
                isLeftChild = false;
            }
            point.key = maxNode.key;
            point.data = maxNode.data;
            if (isLeftChild) {
                parent.left = maxNode.left;
            } else {
                parent.right = maxNode.left;
            }
        }
        //노드 삭제
        System.out.println(key+"번 회원이 삭제되었습니다.");
        return true;
    }


    //노드 검색
    public V search(K key) {
        Node<K, V> point = root; //root, left

        while (true) {
            if (point == null) {
                return null;//노드가 없을 떄
            }
            //입력받은 키와 point에 있는 키의 크기를 구하여라
            //음수가 나오면 key가 크다.
            // 0이 나오면,
            //양수가 나오면 key가 작다

            int result = comp(point.getKey(), key);
            if (result == 0) {//key와 같은 정보를 가진 Data 검색 됨
                return point.getValue();
            } else if (result > 0) {
                point = point.left;
            } else {
                point = point.right;
            }
        }
    }

    //노드 출력
    public void subNodePrint(Node node) {
        if (node != null) {
            subNodePrint(node.left);
            System.out.println(node.getKey()+" " + node.data) ;
            subNodePrint(node.right);
        }

    }

    //노드 출력
    public void print(){
        if (root == null) {//노드가 비어 있을때
            System.out.println("등록된 회원이 없습니다.");
        } else {
            subNodePrint(root);
        }
    }
}
