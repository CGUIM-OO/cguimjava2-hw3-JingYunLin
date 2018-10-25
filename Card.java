public class Card{
	
	enum Suit{Club,Diamond,Heart,Spade}
	
	
	private Suit suit;
	private int rank;
	
	public Card(Suit s, int r){
		suit=s;
		rank=r;
	}	
	
	public void printCard(){
		
	System.out.println(getSuit()+","+getRank());
	}
	public Suit getSuit(){
		return suit;
	}
	public int getRank(){
		return rank;
	}
}