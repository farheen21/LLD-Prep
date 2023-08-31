package Trello.Service;

import Trello.modal.Board;
import Trello.modal.Privacy;
import Trello.modal.User;

import java.util.List;
import java.util.Map;
import java.util.UUID;


//Board: Each board should have a id, name, privacy (PUBLIC/PRIVATE), url, members, lists

//We should be able to create/delete boards, add/remove people from the members list and modify attributes.
//        Deleting a board should delete all lists inside it.
public interface BoardService {
    UUID createBoard(String name);
    void updateBoard(UUID boardId , String name , Privacy privacy);
    void deleteBoard(UUID boardId) throws Exception;

    void addUsersToBoard(UUID boardId , List<User> Users);
    void addUserToBoard(UUID boardId , User user);

    void getBoard(UUID boardId);

    void showAllBoards();
}
