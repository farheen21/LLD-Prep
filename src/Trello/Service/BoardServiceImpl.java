package Trello.Service;

import Trello.modal.Board;
import Trello.modal.Privacy;
import Trello.modal.User;

import java.util.*;

public class BoardServiceImpl implements BoardService{
    Map<UUID , Board> boardMap;

    public BoardServiceImpl(){
        boardMap = new HashMap<>();
    }
    @Override
    public UUID createBoard(String name) {
        Board board = new Board(name);
        this.boardMap.put(board.getBoardId() , board);
        System.out.println("Board Created: "+board.getBoardId());
        return board.getBoardId();
    }


    public void updateBoard(UUID boardId , String name , Privacy privacy) {
        if(this.boardMap.containsKey(boardId)) {
             Board board = this.boardMap.get(boardId);
             if(name != null) {
                 board.setBoardName(name);
             }
             if(privacy != null) {
                 board.setPrivacy(privacy);
             }
            System.out.println("Board updated Successfully");
        }
        else {
            System.out.println("This board does not Exist");
        }

    }



    @Override
    public void deleteBoard(UUID boardId) throws Exception {
        if(boardId != null) {
            boardMap.remove(boardId);
        }else throw new Exception("Board "+boardId+" Not preset in List" +
                " of Boards");
        System.out.println("Board Deleted Successfully");
    }

    @Override
    public void addUsersToBoard(UUID boardId, List<User> users) {
        Board board = this.boardMap.get(boardId);
        if(board != null) {
           List<User> memberUser = board.getMemberUsers();
           memberUser.addAll(users);
           board.setMemberUsers(memberUser);
        }
        boardMap.put(boardId , board);
    }

    @Override
    public void addUserToBoard(UUID boardId, User user) {
       Board board = boardMap.get(boardId);
       if(board != null) {
           List<User> memberUser = board.getMemberUsers();
           memberUser.add(user);
           board.setMemberUsers(memberUser);
       }
       boardMap.put(boardId , board);
    }

    @Override
    public void getBoard(UUID boardId) {
       Board board = this.boardMap.get(boardId);
       if(board != null) {
           System.out.println("Board Id: "+boardId);
           System.out.println("Bord name: "+board.getBoardName());
           System.out.println("privacy: "+board.getPrivacy());
           board.getMemberUsers().forEach( user -> {
               System.out.println("User ID: " + user.getUserId());
               System.out.println("User Name: " + user.getName());
               System.out.println("User Email: " + user.getEmail());
               System.out.println();
           });
       }else {
           System.out.println("Board with id: "+boardId+" does not exist");
       }
    }

    @Override
    public void showAllBoards() {
        System.out.println("List of All Boards:");

        for (Map.Entry<UUID, Board> entry : boardMap.entrySet()) {
            UUID boardId = entry.getKey();
            Board board = entry.getValue();

            System.out.println("Board ID: " + boardId);
            System.out.println("Board Name: " + board.getBoardName());
            // Print other board details as needed
            System.out.println("-----------------------------------");
        }
    }
}
