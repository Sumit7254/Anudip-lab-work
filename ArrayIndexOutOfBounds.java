public class ArrayIndexOutOfBoundsExample {

    public void accessArrayElement(int[] array) {
        // Accessing an element beyond the last index intentionally
        int index = array.length; // Index will be out of bounds
        System.out.println(array[index]);
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] numbers = {1, 2, 3, 4, 5};
        example.accessArrayElement(numbers);
    }
}
