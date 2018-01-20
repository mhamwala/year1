package ads.pkg1;

/* ArrayADT.java
 * ADS class
 * January 2016
 */

public class ArrayADT
{	
    int maxLength;			// max size of array
    int actLength = 0;			// current number of items in array
    int[] dataArray = null;	// element array which, at all time, must be kept tightly packed (i.e. no gaps between elements)


    // Constructor - creates an empty array. Note that the constructor dynamically 
    // allocates the size of the dataArray, but that the size is fixed after initialization.
    public ArrayADT(int size)
    {
	   dataArray = new int[size]; 
           maxLength = size;
    }
    
    
    // Constructor - creates an already populated array.
    public ArrayADT(int[] a)
    {
        dataArray = a;
        maxLength = a.length;
        actLength = a.length;
       
	    
    }
    
    
    // getter method to return the size of the array
    public int getArraySize()
    {
	    
        return maxLength;
    }
    
    
    // getter method to return the number of items in the array
    public int getNoOfItemsInArray()
    {
	    
        return actLength;
    }
    
    
    public void isEmpty()
    {    
        int empty = 0;
        for(int i = 0; i < maxLength; i ++){
            if(dataArray[i] != 0){
                empty = 1;
            }
            
        }
        if(empty == 0){
            System.out.println("This is empty");
        }
        else{
            System.out.println("this is not empty");
        }
        
    }


    public boolean isFull()
    {
        if(maxLength == actLength){
            return true;
        }
        else{
             return false;
        }
       
    }


    
    // method to insert a value at a particular index in the array
    // if index is less than actual number of elements in array, 
    //			shift all values from position index by one to the right, insert value in slot.
    // if index is greater than actual number of elements in array, 
    //			ignore index given and insert value to the right of the last item in array.
    
    public boolean insert(int val, int index)
    {
        dataArray[index-1] = val;
        actLength++;
        
        
    return true;    
    }
    
    // method to retrieve a value at a particular index in the array, returns sentinel value 999 if it fails.
    public int retrieve(int index)
    {
	    int i = dataArray[index-1];
        return i;
    }
    
    
    // method to delete a value at a particular index in the array. Array must remain tightly packed.
    public boolean remove(int index)
    {
	
        int copy[] = dataArray; 
        dataArray = new int[maxLength-1];
        maxLength = maxLength - 1;
        actLength--;
        
        
        for(int i = 0; i < maxLength; i++)
        {
            if(i >= index){
                dataArray[i-1] = copy[i];
            }else{
            dataArray[i] = copy[i];
            }
        }
        dataArray[maxLength-1] = copy[maxLength];
         
        return true;
    }
    
	    
    // method to destroy the array
    public void destroy()
    {
		dataArray = null;
        System.out.println("This data has been destroyed");
    }
    
    
    // method to create a copy of the existing array-data and return it.
    public int[] copyArray()
    {   
        return dataArray;
    
    }
    
    
    // method to increase the array to a new size
    public boolean increaseArraySize(int s)
    {
       int previousMax = maxLength;
       maxLength = s;
       
       int copy[] = dataArray;
       dataArray = new int[s]; 
       
       
       for(int i = 0;i < maxLength;i++){
           
           if(i < previousMax){
               int a = copy[i];
                dataArray[i] = a;
           }
           
          
       }
       
        return true;
    }
    
    
    // method to print the number of items in the array, the array size and the content of the array to a string.
    public String toString()
    {
        if(dataArray == null){
            return "No Array";
        }
        String array = "array : ";
        
        for(int i = 0; i < maxLength; i++){
            array = array+" "+dataArray[i];
        }
        
        return array;
    }


}//end of class