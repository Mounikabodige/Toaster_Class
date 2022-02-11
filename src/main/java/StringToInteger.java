public class StringToInteger {

    public static void main(String[] args){
        System.out.println(convertToInteger("111"));
        System.out.println(convertToInteger("-111"));
        System.out.println(convertToInteger("+111"));
        System.out.println(convertToInteger("0"));
        System.out.println(convertToInteger("-0"));
        System.out.println(convertToInteger("0000"));
        System.out.println(convertToInteger("-01453"));
        System.out.println(convertToInteger("+001453"));
    }

    public static int convertToInteger(String input){
        int result = 0;
        int i = 0;
        boolean negativeNumber = false;
        if(input == null || input.length() == 0)
            return 0;

        if(input.length() == 1 && input.charAt(0) == '0'){
            return 0;
        }
        if(input.charAt(0) == '-'){
            i = 1;
            negativeNumber = true;
        }
        if(input.charAt(0) =='+'){
            i = 1;
        }

        for( ;i < input.length(); i++){
            result = result * 10 + ((int)input.charAt(i) - '0');
        }

        if(negativeNumber){
            result = result * -1;
        }

        return result;
    }
}
