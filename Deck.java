import java.util.ArrayList;
import java.util.Random;

public class Deck{
	private ArrayList<Card> cards;
	private ArrayList<Card> usedCard; 
	public int nUsed;
	
	public Deck(int nDeck){
		cards=new ArrayList<Card>();
		usedCard=new ArrayList<Card>();
		
		   for(int deck=0;deck<nDeck;deck++) {
			   for(Card.Suit s : Card.Suit.values()) {
				   for(int number=1;number<=13;number++) {
					   Card card = new Card(s,number);
					   cards.add(card);
				   }
			   }
		   }
		   
			   
	shuffle();	
}



public void printDeck(){

	for(int deck=0;deck<cards.size();deck++) {
		Card c1 = cards.get(deck);
		c1.printCard();
	}
	

}
public ArrayList<Card> getAllCards(){
	return cards;


}
public void shuffle() {
    nUsed = 0;
    cards.addAll(usedCard);
    usedCard.clear();
    for(int i = 0;i < cards.size() ;i++) 
    {
    Random abc = new Random();	
    int tmp = abc.nextInt(cards.size());
      Card take =cards.get(tmp);
      cards.set(tmp,cards.get(i));
      cards.set(i,take);     
    }
 }
 public Card getOneCard() {
  if(cards.size() == 0) {
   shuffle();
  }
  Card c = cards.get(0);
  cards.remove(0);
  usedCard.add(c);
  nUsed ++;
  return c;
 }
}



