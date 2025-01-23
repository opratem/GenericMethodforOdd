public class GenericMethodforOdd {
    public static void main(String[] args){

        Integer [] numbers = {1,2,3,4,5,6,7,8,9,10};

        int oddCount = countOdd(numbers);
        System.out.println("The Number of odd numbers is: " + oddCount);
    }

    public static <T extends Number> int countOdd(T[] array){
        int oddCount = 0;
        for(T element : array){
            if (isOdd(element.intValue())){
                oddCount++;
            }
        }
        return oddCount;
    }
    
    public static boolean isOdd(int num){
        for (int i = 1; i<=num; i++){
            if (num % 2 == 0){
                return false;
            }
        }
        return true;

    }
}
