public class table {
    public static void main(String args[]){
        int row,col,value,i,mul;
        for(row=1;row<=20;row++)
        {
            value =row;
            for(col=1;col<=20;col++)
            {
                mul=value*col;
                System.out.print("\t"+mul);
            }
            System.out.println();
        }
    }

}
