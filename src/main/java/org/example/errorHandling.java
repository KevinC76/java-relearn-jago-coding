package org.example;

public class errorHandling {
    public static void main(String[] args) {
        try {
            int i = 0;
            System.out.println(i / 0);
        } catch (Exception e) {
            System.out.println("error:" + e);
            throw new RuntimeException(e);
        } finally {
            System.out.println("program selesai dijalankan");
        }

//        throw: melemparkan error
//        throws: menyatakan akan terjadi error
//        try {
//            eksekusi();
//        } catch (Exception e) {
//            System.out.println("error:" + e);
//            throw new RuntimeException(e);
//        }
    }

//    static void eksekusi() throws ArithmeticException, NullPointerException, NumberFormatException{
//        throw new ArithmeticException();
//    }
}
