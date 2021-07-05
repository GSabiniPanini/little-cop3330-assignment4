package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class ToDoListManagerController {

    //gui initializations
    @FXML private BorderPane BorderPane;
    @FXML private MenuBar MenuBar;
    @FXML private Menu FileMenu;
    @FXML private MenuItem FileSaveList;
    @FXML private MenuItem FileSaveAll;
    @FXML private MenuItem FileLoadList;
    @FXML private MenuItem FileLoadCollection;
    @FXML private Menu FilterMenu;
    @FXML private RadioMenuItem ShowAllFilter;
    @FXML private RadioMenuItem ShowDoneFilter;
    @FXML private RadioMenuItem ShowNotDoneFilter;
    @FXML private GridPane LeftGridPane;
    @FXML private ListView<?> ToDoLists;
    @FXML private HBox ListsHBox;
    @FXML private Button AddListButton;
    @FXML private Button RemoveListButton;
    @FXML private Button RenameListButton;
    @FXML private GridPane RightGridPane;
    @FXML private HBox RightTopHBox;
    @FXML private Button EditItemButton;
    @FXML private TreeTableView<?> ListTreeTable;
    @FXML private TreeTableColumn<?, ?> DoneColumn;
    @FXML private TreeTableColumn<?, ?> DescriptionColumn;
    @FXML private TreeTableColumn<?, ?> DateColumn;
    @FXML private HBox RightBottomHBox;
    @FXML private Button AddItemButton;
    @FXML private Button RemoveItemButton;


    @FXML void removeitem(ActionEvent event) {

    }

}
