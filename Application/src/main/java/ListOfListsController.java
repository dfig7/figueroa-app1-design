

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class ListOfListsController {

    @FXML
    private Button openList;
    //

    @FXML
    private Button addNewList;

    @FXML
    private Button deleteList;

    @FXML
    private Button editList;

    @FXML
    private Button saveList;

    @FXML
    private TextField addListNameInput;

    @FXML
    private ListView<?> listOfLists;

}
