
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SelectedListController {

    @FXML
    private Text toDoListName;
    //

    @FXML
    private Button showCompletedButton;

    @FXML
    private Button showIncompletedButton;

    @FXML
    private TableColumn<?, ?> ItemNameRow;

    @FXML
    private TableColumn<?, ?> ItemDescriptionRow;

    @FXML
    private TableColumn<?, ?> ItemDueDateRow;

    @FXML
    private TableColumn<?, ?> ImteCompletedRow;

    @FXML
    private TextField DescriptionInput;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField dueDateInput;

    @FXML
    private Button goBackButton;

    @FXML
    private TextField ItemNameInput;

    @FXML
    private Button addOrEditButton;

}
