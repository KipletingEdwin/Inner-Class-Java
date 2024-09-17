public class OuterClass {

    int number = 6;

    public  void  heyThere(){
        System.out.println("Hey there!");
        class  LocalInnerClass{
            String localInnerClassVariable = "Here;s Edwin";

            public  void  printLocalInnnerClassVariable(){
                System.out.println(localInnerClassVariable);
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalInnnerClassVariable();
    }

    public static class  InnerClass{
        int innerNumber = 8;

        public  void  whatsUp(){
            System.out.println("Whats up from the inner class");
        }

    }



}
