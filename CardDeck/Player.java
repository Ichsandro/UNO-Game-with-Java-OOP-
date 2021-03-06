package CardDeck;
import java.util.ArrayList;
import Cards.Card;
import CardDeck.Deck;

public class Player {
    public String playerName;
    public ArrayList<Card> playerHand;
    public boolean hiji = false;

    public Player(String playerName)
    {
        this.playerName = playerName;
        playerHand = new ArrayList<Card>();
        this.hiji = hiji;
    }

    public String getName()
    {
        return playerName;
    }

    public Card getCard(int i)
    {
        return playerHand.get(i);
    }

    public void addCard(Card c)
    {
        playerHand.add(c);
    }

    public void removeCard(int i)
    {
        playerHand.remove(i);
    }

    public int getJumlah()
    {
        return playerHand.size();
    }

    public void ListCards()
    {
        int i=1;
        for(Card x: playerHand){
            System.out.println(i+". "+x);
            i++;
        }
    }

    public void ShuffleSeven(Deck deck)
    {
        for (int i=0;i<7;i++){
            addCard(deck.draw());
        }
    }

    public boolean getHiji()
    {
        return this.hiji;
    }

    public void declaredHiji()
    {
        this.hiji = true;
    }
}
