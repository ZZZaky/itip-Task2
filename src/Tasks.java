public class Tasks 
{
    public static void main (String[] args) throws Exception 
    {
        /////////////////////////////// TASK 1
        System.out.println("Task 1");
        repeat("mice", 5);
        repeat("hello", 3);
        repeat("stop", 1);
        
        System.out.println();
        
        /////////////////////////////// TASK 2
        System.out.println("Task 2");
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(differenceMaxMin(new int[]{44, 32, 86, 19}));
        
        System.out.println();

        /////////////////////////////// TASK 3
        System.out.println("Task 3");
        System.out.println(isAvgWhole(new int[]{1, 3}));
        System.out.println(isAvgWhole(new int[]{1, 2, 3, 4}));
        System.out.println(isAvgWhole(new int[]{1, 5, 6}));
        System.out.println(isAvgWhole(new int[]{1, 1, 1}));
        System.out.println(isAvgWhole(new int[]{9, 2, 2, 5}));
        
        System.out.println();

        /////////////////////////////// TASK 4
        System.out.println("Task 4");
        int[] list;

        list = cumulativeSum(new int[]{1, 2, 3});
        for (int i = 0; i < list.length; i++) { System.out.print(list[i] + " "); }
        System.out.println();

        list = cumulativeSum(new int[]{1, -2, 3});
        for (int i = 0; i < list.length; i++) { System.out.print(list[i] + " "); }
        System.out.println();

        list = cumulativeSum(new int[]{3, 3, -2, 408, 3, 3});
        for (int i = 0; i < list.length; i++) { System.out.print(list[i] + " "); } 
        System.out.println();

        System.out.println();

        /////////////////////////////// TASK 5
        System.out.println("Task 5");
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));
        
        System.out.println();  

        /////////////////////////////// TASK 6
        System.out.println("Task 6");
        System.out.println(Fibonacci(3 + 1));
        System.out.println(Fibonacci(7 + 1));
        System.out.println(Fibonacci(12 + 1));

        System.out.println();

        /////////////////////////////// TASK 7
        System.out.println("Task 7");
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));

        System.out.println();

        /////////////////////////////// TASK 8
        System.out.println("Task 8");
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));

        System.out.println();
        
        /////////////////////////////// TASK 9
        System.out.println("Task 9");
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));

        System.out.println();

        /////////////////////////////// TASK 10
        System.out.println("Task 10");
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
    }

    // TASK 1
    public static void repeat(String str, int n)
    {
        for (int i = 0; i < str.length(); i++) 
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }
    // TASK 1

    // TASK 2
    public static int differenceMaxMin(int[] arr)
    {
        int min = arr[0];
        int max = 0;

        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max) { max = arr[i]; }
            if (arr[i] < min) { min = arr[i]; }
        }
        return max - min;
    }
    // TASK 2

    // TASK 3
    public static boolean isAvgWhole(int[] arr)
    {
        double avg = 0;
        for (int i = 0; i < arr.length; i++) { avg += arr[i]; }
        avg /= arr.length;
        return avg == (int)avg;
    }
    // TASK 3

    // TASK 4
    public static int[] cumulativeSum(int[] arr)
    {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            temp[i] = 0;
            for (int j = 0; j <= i; j++) 
            {
                temp[i] += arr[j];
            }
        }
        return temp;
    }
    // TASK 4

    // TASK 5
    public static int getDecimalPlaces(String str)
    {
        int num = 0;
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) 
        {
            if (flag) { num++; }
            else if (str.charAt(i) == '.') { flag = true; }
        }
        return num;
    }
    // TASK 5

    // TASK 6
    public static int Fibonacci(int index)
    {
        if (index <= 0) { return 0; }
        else if (index == 1) { return 1; }
        else { return Fibonacci(index - 1) + Fibonacci(index - 2); }
    }
    // TASK 6

    // TASK 7
    public static boolean isValid(String index)
    {
        if (index.length() > 5) { return false; }
        return index.chars().allMatch(Character::isDigit);
    }
    // TASK 7

    // TASK 8
    public static boolean isStrangePair(String str1, String str2)
    {
        if (str1.length() == 0 && str2.length() == 0) { return true; }
        else if (str1.length() == 0 || str2.length() == 0) { return false; }
        else if (str1.charAt(0) == str2.charAt(str2.length() - 1))
        {  
            if (str2.charAt(0) == str1.charAt(str1.length() - 1)) { return true; }
        }
        return false;
    }
    // TASK 8

    // TASK 9
    public static boolean isPrefix(String word, String prefix)
    {
        for (int i = 0; i < prefix.length() - 1; i++) 
        {
            if (word.charAt(i) != prefix.charAt(i)) { return false; }
        }
        return true;
    }

    public static boolean isSuffix(String word, String suffix)
    {
        int j = 1;
        for (int i = word.length() - suffix.length() + 1; i < word.length(); i++) 
        {
            if (word.charAt(i) != suffix.charAt(j++)) { return false; }
        }
        return true;
    }
    // TASK 9

    // TASK 10
    public static int boxSeq(int step)
    {
        int amount = 0;
        {
            for (int i = 1; i <= step; i++) 
            {
                if (i % 2 == 1) { amount += 3; }
                else { amount -= 1; }
            }
        }
        return amount;
    }
    // TASK 10
}
