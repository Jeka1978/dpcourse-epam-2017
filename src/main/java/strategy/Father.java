package strategy;

public interface Father {
   default void talkToSon(){
       System.out.println("иди сюда");
   }
}
