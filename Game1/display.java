package Game1;

public class display{
    public static void out(int charQuantity,int[][] quanjiao,String[][] arr){
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j]);
                for(int k = 0;k < (charQuantity - arr[i][j].length() - quanjiao[i][j]);k++){
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void out(int charQuantity,paneMap quanjiao,paneMap arr,int length,int height){
        int[][] quanjiao_ = new int[length][height];
        String[][] arr_ = new String[length][height];
        //将paneMap转为array
        for(int i = 0;i < height;i++){
            for(int j = 0;j < length;j++){
                quanjiao_[i][j] = (Integer)quanjiao.get(i,j);
                arr_[i][j] = (String)arr.get(i,j);
            }
        }
        //直接执行原来的方法
        display.out(charQuantity,quanjiao_,arr_);
    }
}
