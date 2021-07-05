package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class ToDoListManagerController {

    @FXML private BorderPane BorderPane;
    @FXML private Menu FileMenu;
    @FXML private MenuItem FileSaveList;
    @FXML private MenuItem FileSaveAll;
    @FXML private MenuItem FileLoadList;
    @FXML private MenuItem FileLoadCollection;
    @FXML private Menu FilterMenu;
    @FXML private RadioMenuItem ShowAllFilter;
    @FXML private ToggleGroup FilterToggleGroup;
    @FXML private RadioMenuItem ShowDoneFilter;
    @FXML private RadioMenuItem ShowNotDoneFilter;
    @FXML private GridPane LeftGridPane;
    @FXML private ListView<?> ToDoListView;
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


    @FXML
    void AddListButtonClicked(ActionEvent event) {

    }

    @FXML
    void EditItemButtonClicked(ActionEvent event) {

    }

    @FXML
    void RemoveListButtonClicked(ActionEvent event) {

    }

    @FXML
    void RenameListButtonClicked(ActionEvent event) {

    }

    @FXML
    void ShowAllFilterClicked(ActionEvent event) {

    }

    @FXML
    void ShowDoneFilterClicked(ActionEvent event) {

    }

    @FXML
    void ShowNotDoneFilterClicked(ActionEvent event) {

    }

    @FXML
    void addItemButtonClicked(ActionEvent event) {

    }

    @FXML
    void menuLoadCollectionClicked(ActionEvent event) {

    }

    @FXML
    void menuLoadListClicked(ActionEvent event) {

    }

    @FXML
    void menuSaveAllClicked(ActionEvent event) {

    }

    @FXML
    void menuSaveListClicked(ActionEvent event) {

    }

    @FXML
    void removeItemButtonClicked(ActionEvent event) {

    }

}
