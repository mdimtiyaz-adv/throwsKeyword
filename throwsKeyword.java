// throws keyword tells that the exception is coming . it tells that i am not for responsible for the exception . the one who handle me is the responsible for the exception. its not good to use throws exceptions in main because there is no any parent of main. there is jvm . so never user in it.

class Operation {
    public void show() throws Exception {
        Class.forName("Calc");
    }
}

public class throwsKeyword {
    public static void main(String[] args) {
        Operation obj = new Operation();
        // obj.show(); // here show throw exception so we have to handle it.
        try {
            obj.show();
        } catch (Exception e) {
            System.out.println("cant find the class");
        }
    }
}
