public class Unit03{
    
    public static int shiftRight(int num)    {
        return -1;
    }
    public static int shiftRight(int num, int k) {
    
    if (num < 1000 || num > 9999)
        return -1;

    
    if (k < 0 || k > 4)
        return -1;

    
    if (k == 0 || k == 4)
        return num;

    int powK =  (int) Math.pow(10, k);       
    int powNK = (int) Math.pow(10, 4 - k); 

    int lastK = num % powK;  
    int firstPart = num / powK; 

    return lastK * powNK + firstPart;
}
}
    public static int shiftLeft(int num)    {
    if (num < 1000 || num > 9999)
        return -1;

    int firstDigit = num / 1000;   
    int rest = num % 1000;         

    return rest * 10 + firstDigit;
    }
    public static int shiftLeft(int num, int k){
        return -1;
    }
    public static String shiftRight(String s)    {
        return "";
    }
    public static String shiftLeft(String shiftleft)    {
        int len = shiftleft.length();
        if (shiftleft == "") {
            System.out.println(shiftleft);
        } else {
            String firstletter = shiftleft.substring(0,1);
            shiftleft = shiftleft.substring(1,len);
            shiftleft = (shiftleft + firstletter);        
            System.out.println(shiftleft);
        }
        return shiftleft;
    }
    public static String shiftLeft(String s, int k)    {
        return "";
    }
    public static String shiftRight(String s, int k)    {
        return "";
    }
    public static int countWords(String s)    {
        return -1;
    }
    public static int countParts(String s, char separator)    {
        return -1;
    }
    public static String getParts(String s, char separator)    {
        return "";
    }
    public static void printParts(String s, char separator)    {
        
    } 
    
}
