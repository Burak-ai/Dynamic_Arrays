package DynamicArrays;
public class Main {
    

    public static void main(String[] args) {
        
        DynamicArray dynamicArray = new DynamicArray();
        
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");


        dynamicArray.delete("A");
        dynamicArray.insert(0, "x");
        System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());
    }
}
