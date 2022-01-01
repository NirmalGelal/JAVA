package com.company;


class InvalidAge extends Exception{
    InvalidAge(String s){
        super(s);
    }
}

public class CustomException {
    void check(int x){
        try {
            if (x < 18) {
                throw new InvalidAge("Not a valid age");
            }
        }
        catch (InvalidAge s){
            System.out.println(s.getMessage());
        }
        finally {
            System.out.println("this is executed anyway");
        }
    }

    public static void main(String[] args) {
        CustomException obj = new CustomException();
        obj.check(56);
    }
}

