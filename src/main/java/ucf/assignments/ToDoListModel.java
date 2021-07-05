/*
 * UCF COP3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Glenroy Little
 */

package ucf.assignments;

import java.util.Collection;

public class ToDoListModel {
    private Collection<ToDoList> toDoListGroup;

    public void addList() {
        //bring up popup window with string input box
        //call appendList with string
        //call updateViews
    }

    private void appendList(String s) {
        //add ToDoList object with title s to toDoListGroup
    }

    public void updateViews() {
        //call updateTable with selected ToDoList
        //call updateList with current Collection<ToDoList>
    }

    public void removeList() {
        //check to see if a ToDoList is selected
            //bring up alert confirmation dialog
            //call removeObjectFromList with selected ToDoList
            //call updateViews
        //if not do nothing
    }

    private void removeObjectFromList(ToDoList l) {
        //remove ToDoList object l from  toDoListGroup
    }

    public void renameList() {
        //check to see if a ToDoList is selected
            //bring up popup window with string input box
            //call changeListName with selected ToDoList and returned string
            //call updateViews
        //if not do nothing
    }

    private void changeListName(ToDoList l, String s) {
        //call ToDoList.setTitle using l and s
    }

    public void addItem() {
        //check to see if a ToDoList is selected
            //bring up popup window with two string input boxes for desc and date
            //call addItemToList with selected ToDoList and the two returned strings
            //call updateViews
        //if not do nothing
    }

    private void addItemToList(ToDoList l, String s1, String s2) {
        //call ToDoList.addItem using l, s1, and s2
    }

    public void removeItem() {
        //check to see if a ToDoListItem is selected
            //call removeItemFromList with selected ToDoList and ToDoListItem
            //call updateViews
        //if not do nothing
    }

    private void removeItemFromList(ToDoList l, ToDoListItem li) {
        //call ToDoList.removeItem using l and li
    }

    public void editItem() {
        //check to see if a ToDoListItem is selected
            //bring up edit popup window that displays ToDoListItem variables in editable fields loaded with existing data
            //call editItemValues using selected ToDoList and ToDoListItem, use two strings from edit window as params
            //call updateViews
        //if not do nothing
    }

    private void editItemValues(ToDoList l, ToDoListItem li, String s1, String s2) {
        //call ToDoList.editItem using l, li, s1, and s2
    }

    private void updateTable(ToDoList l) {
        //set toDoListView to l
    }

    private void updateList(Collection<ToDoList> c) {
        //set listTreeTable to c
    }
}
