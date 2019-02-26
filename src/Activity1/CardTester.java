package Activity1;

public class CardTester {
  public static void main(String[] args){
        Card card1 = new Card("A","Spades", 1);
        Card card2 = new Card("3","Hearts", 3);
        Card card3 = new Card("6","Diamonds", 6);

        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println(card3.toString());

        System.out.println(card1.matches(card2));
        System.out.println(card2.matches(card3));
    }
}
