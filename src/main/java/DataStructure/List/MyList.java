package DataStructure.List;

/**
 * @Author zhangjiaheng
 * @Description 链表实现
 **/
public class MyList {

    /**
     * 头节点引用
     */
    private MyNode first = null;
    /**
     * 尾节点引用
     */
    private MyNode last = null;

    /**
     * 根据数组构造链表
     */
    MyList(int[] arr) throws Exception {
        MyNode currn = null;
        if (arr.length == 0) {
            throw new Exception("new array cannot be empty");
        }
        for (int i = 0; i < arr.length; i++) {
            MyNode nodei = new MyNode(arr[i]);
            if (i == 0) {
                first = nodei;
                currn = first;
            } else {
                currn.next = nodei;
                currn = currn.next;
            }
            last = currn;
        }
    }

    /**
     * 向链表末尾添加元素
     */
    public MyNode add(MyNode node) {
        if (node == null) {
            throw new NullPointerException("new node cannot be null");
        }
        last.next = node;
        last = node;
        return first;
    }

    public MyNode get(int index){
        MyNode node = first;
        if(index < 0){
            throw new IndexOutOfBoundsException("Index out of bound exception");
        }
        while(index -- > 0){
            node = node.next;
            if(node == null){
                throw new IndexOutOfBoundsException("Index out of bound exception");
            }
        }
        return node;
    }

    /**
     * @return 翻转链表 返回头节点 🙃
     */
    public MyNode reverse() {
        if (null == first || first.next == null) {
            return first;
        }
        MyNode pPrev = first;
        MyNode pNode = pPrev.next;
        pPrev.next = null;
        MyNode pNext = pNode.next;
        while (pNext != null) {
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
            pNext = pNext.next;
        }
        pNode.next = pPrev;
        first = pNode;
        return first;
    }

    /**
     * 向指定下标插入元素
     */
    public MyNode add(MyNode node, int index) throws Exception {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index out of bound exception");
        }
        if (index == 0) {
            node.next = first;
            first = node;
            return first;
        }
        MyNode i = first;
        // index-- > 1 保证插入在原下标的前面
        while (i.next != null && index-- > 1) {
            i = i.next;
        }
        if (index > 0) {
            throw new IndexOutOfBoundsException("Index out of bound exception");
        }
        node.next = i.next;
        i.next = node;
        return first;
    }

    /**
     * 删除链表节点
     */
    public void remove(int val) {
        MyNode i = first, j = first;
        while (i.val == val) {
            first = first.next;
            i.next = null;
            i = first;
            j = first;

        }
        i = i.next;
        while (i != null) {
            if (i.val == val) {
                j.next = i.next;
                i.next = null;
                i = j.next;
            } else {
                i = i.next;
                j = j.next;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int a[] = {3, 9};
        MyList list = new MyList(a);
        list.add(new MyNode(7));
        list.add(new MyNode(1), 0);
        System.out.println(list);
        list.reverse();
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }

    @Override
    public String toString() {
        System.out.print("list : ");
        MyNode node = first;
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("nil");
        return "";
    }
}
