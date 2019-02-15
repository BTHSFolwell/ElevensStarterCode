package Activity1;

/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {
  public static void main(String[] args){
        Card card1= new Card("A","Spades", 1);
        Card card2= new Card("3","Hearts", 3);
        Card card3= new Card("6","Diamonds", 9);

        System.out.println(card1.matches(card2));
        System.out.println(card2.matches(card3));
    }
}
