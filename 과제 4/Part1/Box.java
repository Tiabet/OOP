//********************************************************************
//  Box.java       Java Foundations
//
//********************************************************************

public class Box implements Comparable {

    private int height, width, depth;
    private boolean full;

    //-----------------------------------------------------------------
    //  Sets up this Box object with the specified data.
    //-----------------------------------------------------------------
    public Box(int heightInit, int widthInit, int depthInit) {
        height = heightInit;
        width = widthInit;
        depth = depthInit;
        full = false;
    }

    //-----------------------------------------------------------------
    //  Accessors.
    //-----------------------------------------------------------------
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public boolean isFull() {
        return full;
    }

    //-----------------------------------------------------------------
    //  Mutators.
    //-----------------------------------------------------------------
    public void setHeight(int heightUpdate) {
        height = heightUpdate;
    }

    public void setWidth(int widthUpdate) {
        width = widthUpdate;
    }

    public void setDepth(int depthUpdate) {
        depth = depthUpdate;
    }

    public void setFull(boolean fullUpdate) {
        full = fullUpdate;
    }

    /*
   override toString
     */

    @Override
    public String toString() {
        String ifFull;
        if (full == false) {
            ifFull = "not full";
        } else {
            ifFull = "full";
        }
        String result = "Box size :" + height + "H x" + width + "W x " + depth + "D" + "\n";
        result += "This box is " + ifFull + ". \n";
        result += "The volume is " + computeVolume();
        return result;

    }
    //method computes Volume
    public int computeVolume() {
        int Volume = height * width * depth;
        return Volume;
    }
    
    //override compareTo method
    @Override
    public int compareTo(Object t) {
        Box that = (Box) t;

        return this.computeVolume() - that.computeVolume();

    }

}