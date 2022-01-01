package com.company;

public class ExceptionPractice {

    public void check(int x) throws Exception{
        if (x==0){
            throw new Exception("Age cannot be zero");
        }

        else if (x<18) {
            throw new Exception("Invalid age");
        }

        else{
            System.out.println("Congratss");
        }
    }
    public static void main(String[] args) {
        ExceptionPractice obj = new ExceptionPractice();
        try{
            obj.check(0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This is always executed..");
        }
    }
}
