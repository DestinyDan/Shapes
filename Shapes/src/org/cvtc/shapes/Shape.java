package org.cvtc.shapes;

public abstract class Shape {

	// class object
    public Dialog messageBox;
    
    // getters & setters
    protected Dialog getMessageBox(){
        return this.messageBox;
    }

    private void setMessageBox(Dialog messageBox) {
        this.messageBox = messageBox;
    }
    
    // constructor
    public Shape(Dialog messageBox) {
        this.messageBox = messageBox;
    }

    // abstract class methods
    public abstract float surfaceArea();
    public abstract float volume();

}
