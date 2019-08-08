package com.abstractclass;

public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            this.root = newItem;
            return true;
        }
        else{
            ListItem currentItem = this.root;
            while(currentItem!=null){
                int comparision =  currentItem.compareTo(newItem);
                if(comparision<0){
                    // newitem is greater is greater than current item.
                    if(currentItem.next()!=null){
                        currentItem = currentItem.next();
                    }
                    else{
                        currentItem.setNext(newItem).setPrevious(currentItem);
                        return true;
                    }
                }else if (comparision>0){ //newitem is smaller.
                    if(currentItem.previous()!=null){
                        currentItem.previous().setNext(newItem);
                        newItem.setPrevious(currentItem.previous());
                        newItem.setNext(currentItem);
                        currentItem.setPrevious(newItem);
                    }
                    else{
                        newItem.setNext(this.root);
                        this.root.setPrevious(newItem);
                        this.root = newItem;


                    }
                    return true;
                }else{
                    System.out.println(newItem.getValue()+" is already present");
                    return false;
                }
            }
            return false;
        }
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.printf("removing the item "+ item.getValue());

            ListItem currentItem = this.root;
            while(currentItem!=null){
                int comparision = currentItem.compareTo(item);
                if (comparision==0){
                    // found the element;
                    if(currentItem == this.root){
                        this.root = this.root.next();
                    }
                    else {
                        currentItem.previous().setNext(currentItem.next());
                        if(currentItem.next()!=null){
                            currentItem.next().setPrevious(currentItem.previous());
                        }
                    }
                    return true;
                }else if(comparision>0){
                    currentItem = currentItem.next();
                }else{
                    return false;
                }
            }
        }
        // we have reached the end of list without finding the item to delete.
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("list is empty");
        }
        else{
            ListItem currItem = this.root;
            while(currItem!=null){
                System.out.println(currItem.getValue());
                currItem = currItem.next();
            }
        }

    }
}
