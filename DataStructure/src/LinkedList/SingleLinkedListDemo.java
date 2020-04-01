package LinkedList;


public class SingleLinkedListDemo {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        Personnode p1 = new Personnode(1, "憨憨");
        Personnode p2 = new Personnode(2, "皮皮");
        Personnode p3 = new Personnode(3, "弟弟");
        Personnode p4 = new Personnode(4, "哥哥");

//        sll.add(p1);
//        sll.add(p2);
//        sll.add(p3);
//        sll.add(p4);
        sll.addByOrder(p1);
        sll.addByOrder(p3);
        sll.addByOrder(p2);
        sll.addByOrder(p4);
        sll.list();
        System.out.println("-----修改后------");
        sll.update(new Personnode(2,"哈哈"));
        sll.list();
        System.out.println("-----删除后------");
        sll.delete(p2);
//        sll.delete(new Personnode(6,"哈哈"));
        sll.list();
    }
    static class SingleLinkedList{
        //定义链表的头节点
        private Personnode person = new Personnode();

        //在单链表尾部添加新节点
        public void add(Personnode personnode){
            //由于头节点不能变，需要一个临时变量
            Personnode temp = person;
            //遍历链表，找到链表尾部
            while (true){
                if(temp.next == null){  //下个节点为空时，则该节点为尾节点
                    break;
                }
                //没用找到，将节点后移再找
                temp = temp.next;
            }
            //找到尾节点后将新节点添加到尾节点后
            temp.next = personnode;     //personnode = temp.next;   这样表示的是将节点的下一个节点赋值给将要添加的节点会导致添加不进去
        }

        //根据顺序添加节点
        public void addByOrder(Personnode personnode){
            Personnode temp = person;
            boolean flag = false;   //标记改序号是否已经存在，默认为false
            //需要遍历找到序号的位置
            while (true){
                if(temp.next == null){  //说明链表已经在尾部
                    break;
                }
                if(temp.next.node > personnode.node){  //找到该插入的位置
                    break;
                }else if (temp.next.node == personnode.node){
                    flag = true;
                    System.out.printf("%d节点已经存在，不能再添加\n",personnode.node);

                }
                //后移节点
                temp = temp.next;
            }
            if(!flag){
                //插入节点
                personnode.next = temp.next;
                temp.next = personnode;
            }

        }

        //更改节点信息,序号不能更改，更改了就相当于加入新的节点了
        public void update(Personnode personnode){
            Personnode temp = person;
            boolean flag = false;
            //先判空
            isNull();

            while(true){
                if(temp.next == null){   //遍历完了列表
                    break;
                }
                if(temp.next.node == personnode.node){
                    flag = true;
                    break;
                }
                //后移
                temp = temp.next;
            }
            if(flag){
                temp.next.name = personnode.name;
            }else {
                //如果修改的节点不存在，直接加入新的节点
                addByOrder(personnode);
            }
        }

        //删除节点
        public void delete(Personnode personnode){
            Personnode temp = person;
            boolean flag = false;
            //先判空
            isNull();
            //判断改节点是否存在
            while (true){
                if(temp.next == null){  //链表被遍历完
                    break;
                }
                if(temp.next.node == personnode.node){  //找到该节点
                    flag = true;
                    break;
                }
                temp = temp.next;
            }
            if(flag){
                temp.next = personnode.next;
            }else {
                System.out.println("没有找到改节点");
            }

        }

        //遍历链表
        public void list(){
            //由于头节点不能变，需要一个临时变量
            Personnode temp = person;
            //先判链表是否为空
            if(person.next == null){
                System.out.println("链表为空！");
            }
            while (true){
                if(temp.next == null){
                    break;
                }
                temp = temp.next;   //必须在打印输出的在前面 ，否则会将头节点打印出来导致少遍历一个节点
                System.out.println(temp);

            }
        }

        //判空
        public void isNull(){
            if(person.next == null){
                System.out.println("链表为空！");
            }
        }
    }

    static class Personnode{
        private int node;
        private String name;
        private Personnode next;

        public int getNode() {
            return node;
        }

        public void setNode(int node) {
            this.node = node;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Personnode getNext() {
            return next;
        }

        public void setNext(Personnode next) {
            this.next = next;
        }

        public Personnode() {

        }

        public Personnode(int node, String name) {
            this.node = node;
            this.name = name;
        }


        @Override
        public String toString() {
            return "Personnode{" +
                    "node=" + node +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}

