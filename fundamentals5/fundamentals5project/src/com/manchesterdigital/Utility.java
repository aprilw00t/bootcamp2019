package com.manchesterdigital;

public class Utility {

    protected static Boolean isEven(int a){
     return (a % 2 == 0);
    }

    protected static boolean isNamesTheSame(String a, String b)
    {return (a.equalsIgnoreCase(b));
    }

    protected static Long convertStingToLong(String input)
            throws NumberFormatException {
        return new Long(input);
    }
}
//dont do this
//try{
//    long num = Utility.convertStringToLong("23")
//        }
//catch (throwable e){
//
//        }

//also this is bad
//don't re-throw your throw bro
//try{
//    long num2 = Utility.convertStringToLong("23")
//        }
//catch (throwable e){
//System.err.println(e) --- putting this then re-throwing will
//result in 2 stack traces in one go
//throw e
//        }
//