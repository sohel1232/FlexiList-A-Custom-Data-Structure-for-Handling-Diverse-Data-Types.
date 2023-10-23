import java.util.*;
                    //PLEASE NOTE : THE FLEXILIST IS DESIGNED TO BE 1-INDEXED AND NOT ZERO INDEXED.
public class FlexliList {

    private Node head;               //head of individual flexiList
    private Node tail;              //tail of individual flexiList
    private int size;                //dynamic size of flexiList

    FlexliList(){
        this.size =0;
    }       //size is zero at the initialisation of flexiList

    private class Node{     //blueprint for each node at each index of out flexiList
        private int data;
        private String str;
        private char ch;
        private Node next;

        Node(int data){
            this.data = data;
            this.str = "";
            this.ch = ' ';
            this.next = null;
        }

        Node(String str){
            this.data = Integer.MAX_VALUE;
            this.str = str;
            this.ch = ' ';
            this.next = null;
        }

        Node(char ch){
            this.data = Integer.MAX_VALUE;
            this.str = "";
            this.ch = ch;
            this.next = null;
        }
    }

    // function to add integer data into our flexiList.
    public  void add(int data){
        Node node = new Node(data);        //By default it adds element at the last of our flexiList.

        if(head == null && tail==null){      //if FlexiList is empty
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // function to add String data into our flexiList.
    public  void add(String str){
        Node node = new Node(str);      //By default it adds element at the last of our flexiList.
        if(head == null && tail==null){     //if flexiList is empty.
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    //function to add char type data into our FlexiList
    public  void add(char ch){
        Node node = new Node(ch);            //By default it adds element at the last of our flexiList.

        if(head == null && tail==null){         //if list is empty.
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    //function to add integer type data at the beginning of FlexiList
    public void addFirst(int data){
        Node node = new Node(data);

        if(head == null && tail == null){
            add(data);
            size++;
            return;
        }       //if FlexiList is empty

        node.next = head;
        head = node;
        size++;
    }

    //function to add String type data at the beginning of FlexiList
    public void addFirst(String str){
        Node node = new Node(str);

        if(head == null && tail == null){           //if FlexiList is empty
            add(str);
            size++;
            return;
        }

        node.next = head;
        head = node;
        size++;
    }

    //function to add char type data at the beginning of FlexiList
    public void addFirst(char ch){
        Node node = new Node(ch);

        if(head == null && tail == null){           //if FlexiList is empty
            add(ch);
            size++;
            return;
        }

        node.next = head;
        head = node;
        size++;
    }

    //function to print element at index "index" of flexiList.
    public void displayAt(int index){
        Node temp = head;
        int i = 1 ;
        while(i != index){
            i++;
            temp = temp.next;
        }
        if(temp.data!=Integer.MAX_VALUE)System.out.println(temp.data);
        else if(!temp.str.isEmpty())System.out.println(temp.str);
        else System.out.println(temp.ch);
    }

    //function to return integer type data at index "index" of FlexiList.
    public int getDataAt(int index)throws Exception{
        Node temp = head;
        int i = 1 ;
        while(i != index){
            i++;
            temp = temp.next;
        }

        if(temp.data==Integer.MAX_VALUE)throw new Exception("REQUIRED ENTRY IS NOT AN INTEGER IN THE FLEXILIST");
        else return temp.data;

    }

    //function to return String type data at index "index" of FlexiList.
    public String getStrAt(int index)throws Exception{
        Node temp = head;
        int i = 1 ;
        while(i != index){
            i++;
            temp = temp.next;
        }

        if(temp.str.isEmpty())throw new Exception("REQUIRED ENTRY IS NOT A STRING IN THE FLEXILIST");
        else return temp.str;
    }

    //function to return Character type data at index "index" of FlexiList.
    public char getCharAt(int index)throws Exception{
        Node temp = head;
        int i = 1 ;
        while(i != index){
            i++;
            temp = temp.next;
        }

        if(temp.ch == ' ')throw new Exception("REQUIRED ENTRY IS NOT A CHARACTER IN THE FLEXILIST");
        else return temp.ch;
    }

    //function to delete elment at index "index" of FlexiList.
    public void remove(int index){
        if(index == 1 ){head = head.next;size--;return;} // if only 1 element is in list.
        int i = 1;
        Node temp = head;
        while(i!=index-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }

    //function to return ArrayList of Integers  of all the integer entries present in FlexiList
    public List<Integer> toIntegerArray(){
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            if(temp.data!=Integer.MAX_VALUE)list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }

    //function to return ArrayList of Strings  of all the integer entries present in FlexiList
    public List<String> toStringArray(){
        List<String> list = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            if(!temp.str.isEmpty())list.add(temp.str);
            temp = temp.next;
        }
        return list;
    }

    //function to return ArrayList of Characters of all the integer entries present in FlexiList
    public List<Character> toCharArray(){
        List<Character> list = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            if(temp.ch!=' ')list.add(temp.ch);
            temp = temp.next;
        }
        return list;
    }

    //function to update entry to integer at any index "index" of FlexiList.Independent of type of datatype already present at the index "index".
    public void updateAtIndex(int index , int value){
        Node temp = head;
        int i = 1 ;
        while(index != i){
            i++;
            temp = temp.next;
        }
        temp.data = value;
        temp.ch = ' ';
        temp.str = "";
    }

    //function to update entry to string at any index "index" of FlexiList.Independent of type of datatype already present at the index "index".
    public void updateAtIndex(int index , String a){
        Node temp = head;
        int i = 1 ;
        while(index != i){
            i++;
            temp = temp.next;
        }
        temp.data = Integer.MAX_VALUE;
        temp.ch = ' ';
        temp.str = a;
    }

    //function to update entry to character at any index "index" of FlexiList.Independent of type of datatype already present at the index "index".
    public void updateAtIndex(int index , char c){
        Node temp = head;
        int i = 1 ;
        while(index != i){
            i++;
            temp = temp.next;
        }
        temp.data = Integer.MAX_VALUE;
        temp.ch = c;
        temp.str = "";
    }

    //function to display the FlexiList.After printing the List it goes to nextLine.
    public void display(){
        Node temp = head;
        System.out.print("FlexiList is : ");
        while(temp!=null) {
            if(temp.data!=Integer.MAX_VALUE)System.out.print(temp.data + " - ");
            else if(!temp.str.isEmpty())System.out.print(temp.str + " - ");
            else System.out.print(temp.ch + " - ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    //function to return the length of FlexiList at any point of time.
    public int length(){return size;}

    //function to return if the FlexiList is empty or not
    public boolean isEmpty(){
        return size == 0;
    }


}