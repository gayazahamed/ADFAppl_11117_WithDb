package model;

public class ProfileBean {
    public ProfileBean() {
    }

    public String method1() {
        Thread t = Thread.currentThread();
        try {
            t.sleep(1000);
        } catch (Exception e) {

            e.printStackTrace();
        }
        System.out.println("method 11111");
        System.out.println("method 11111");
        System.out.println("method 11111");
        System.out.println("method 11111");
        System.out.println("method 11111");
        System.out.println("method 11111");
        System.out.println("method 11111");
        System.out.println("method 11111");

        return null;
    }

    public String method2() {
        Thread t = Thread.currentThread();
        try {
            t.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Method22222222222222");
        System.out.println("Method22222222222222");
        System.out.println("Method22222222222222");
        System.out.println("Method22222222222222");
        System.out.println("Method22222222222222");
        System.out.println("Method22222222222222");
        System.out.println("Method22222222222222");
        System.out.println("Method22222222222222");
        System.out.println("Method22222222222222");
        return null;
    }

    public String method3() {
        System.out.println("Method         3");
        System.out.println("Method         3");
        System.out.println("Method         3");
        System.out.println("Method         3");
        System.out.println("Method         3");
        System.out.println("Method         3");
        System.out.println("Method         3");
        System.out.println("Method         3");
        System.out.println("Method         3");
        Thread t = Thread.currentThread();
        try {
            t.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    
    public void method4() {
        System.out.println("Method         4");
        System.out.println("Method         4");
        System.out.println("Method         4");
        System.out.println("Method         4");
        System.out.println("Method         4");
    }
}
