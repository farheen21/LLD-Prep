package Trello.modal;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Board {

//    Board: Each board should have a id, name, privacy (PUBLIC/PRIVATE), url, members, lists

    private UUID boardId;
    private  String boardName;
    private Privacy privacy;
    private  String url;
    private List<User> memberUsers;

    private List<BoardList> boardListList;

    public Board(String boardName) {
        this.boardId = UUID.randomUUID();
        this.boardName = boardName;
        this.privacy = Privacy.PUBLIC;
        this.url = "board/"+this.boardId;
        this.memberUsers = new ArrayList<>();
        this.boardListList = new ArrayList<>();
    }



    public UUID getBoardId() {
        return boardId;
    }

    public void setBoardId(UUID boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public Privacy getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Privacy privacy) {
        this.privacy = privacy;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<User> getMemberUsers() {
        return memberUsers;
    }

    public void setMemberUsers(List<User> memberUsers) {
        this.memberUsers = memberUsers;
    }

    public List<BoardList> getBoardListList() {
        return boardListList;
    }

    public void setBoardListList(List<BoardList> boardListList) {
        this.boardListList = boardListList;
    }

}
