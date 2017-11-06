package strategy;

public interface Mother {
   default void talkToSon(){
       System.out.println("ИДИ СЮДА!!!");
   }
}
