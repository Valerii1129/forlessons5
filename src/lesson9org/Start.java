package lesson9org;

public class Start {
    public static void main(String[] args) {
        MyList<Integer> myArrayList = new MyArrayList<>();
        MyList<Integer> myArrayList2 = new MyArrayList<>();
        MyList<Integer> myArrayList3 = new MyArrayList<>();

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        myArrayList2.add(5);
        myArrayList2.add(6);

        myArrayList2.add(4, 0);

        myArrayList.addAll(myArrayList2);
        System.out.println("addAll " + myArrayList);

        myArrayList.remove(0);
        System.out.println("remove " + myArrayList);

        myArrayList.removeElem(2);
        System.out.println("remove element " + myArrayList);

        myArrayList.set(1, 3);
        System.out.println("set " + myArrayList);

        System.out.println("size " + myArrayList.size());

        System.out.println("get " + myArrayList.get(0));

        System.out.println(myArrayList3.isEmpty());
    }
}
