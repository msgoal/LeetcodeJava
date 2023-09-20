package com.java.interview.questions.override.nonstatic.as.staticm;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            //int x = 5/0;
            try{
                int y = 6/0;
            }catch (Exception e){
                System.out.println("AJAYKUMARN");
            }
            finally {
                System.out.println("VIJAYKUMARN");
            }
        }catch (Exception e){
            //System.exit(0);
            System.out.println("QRSTUVWXYZ");
        }finally {
            System.out.println("ABCDEFGH");
            System.out.println("IJKLMNOP");
        }

    }
}
