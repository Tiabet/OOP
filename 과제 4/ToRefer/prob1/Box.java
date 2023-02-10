//********************************************************************
//  Box.java       Java Foundations
//
//********************************************************************

public class Box 
{
   private int height, width, depth;

   //-----------------------------------------------------------------
   //  Sets up this Box object with the specified data.
   //-----------------------------------------------------------------
   public Box (int heightInit, int widthInit, int depthInit)
   {
      height = heightInit;
      width = widthInit;
      depth = depthInit;
      full = false;
   }

   //-----------------------------------------------------------------
   //  Accessors.
   //-----------------------------------------------------------------
   public int getHeight ()
   {
	   return height;
   }

   public int getWidth ()
   {
	   return width;
   }

   public int getDepth ()
   {
	   return depth;
   }



   //-----------------------------------------------------------------
   //  Mutators.
   //-----------------------------------------------------------------
   public void setHeight (int heightUpdate)
   {
      height = heightUpdate;
   }

   public void setWidth (int widthUpdate)
   {
      width = widthUpdate;
   }

   public void setDepth (int depthUpdate)
   {
      depth = depthUpdate;
   }



   
   //to-do
   //public String toString ()
   

   //to-do
   //public int computeVolume()

   //to-do
   //public int compareTo(Object that)

}
