public class Robot
{
    private static int Count = 0;
    private static int  Grid[][] = new int[4][4];
    public static void main(String args[])
    {
        for (int i =0 ; i < 4 ; i++)
        {
            for (int j =0 ; j < 4 ; j++)
                Grid[i][j] = 0; // new comment
        }

        SolveMaze(0,0);

        System.out.print(Count);
        
    }

    private  static void SolveMaze(int x , int y)
    {
        if (x < 0 || y < 0 || x > 3 || y > 3 || Grid[x][y] == 1)
            return;

        Grid[x][y] = 1;

        if (x== 3 && y == 3)
        {
            Count++;
        }
        else
        {

            SolveMaze(x, y + 1);
            SolveMaze(x + 1, y);
            SolveMaze(x - 1, y);
            SolveMaze(x, y - 1);
        }

        Grid[x][y] = 0;
    }
}
