package Trello.modal;

import java.util.List;
import java.util.UUID;

public class BoardList {
//    List: Each list should have a id, name and cards

    private UUID listId;
    private String listName;

    private List<Card> cards;


    public BoardList(UUID listId, String listName, Card card , List<Card> cards) {
        this.listId = listId;
        this.listName = listName;
        this.cards = cards;
    }


    public UUID getListId() {
        return listId;
    }

    public void setListId(UUID listId) {
        this.listId = listId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }


    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}

