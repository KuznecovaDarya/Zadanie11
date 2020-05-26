class Main {
  public static void main(String[] args) {
    System.out.print("Задание 1\n");
    int m=8;
    int[][] f=new int[m][m];
    for(int i=0;i<8;i++)
    { 
      for(int j=0;j<8;j++)
      { 
        if((i+j)%2==0)
        {
          f[i][j]=1;
        }
        else f[i][j]=0;
      }
    }
    for (int i=0;i < f.length;i++,System.out.println())
    {
      for (int j=0;j < f[i].length;j++)
      {
        System.out.print(f[i][j]+"\t");
      }
    }
    System.out.print("Задание 2\n");
    int n=10;
    int[][] a=new int[n][n];
    for (int i=0;i < a.length;i++)
    {
      for (int j=0;j < a[i].length;j++)
      {
       a[i][j]=(int)(Math.round(Math.random()*100) + -50);
      }
    }
    for (int i=0;i < a.length;i++,System.out.println())
    {
      for (int j=0;j < a[i].length;j++)
      {
        System.out.print(a[i][j]+"\t");
      }
    }
    System.out.print("Задание 3");
    int s=0;
    for (int i=0;i < a.length;i++)
    {
      for (int j=0;j < a[i].length;j++)
      {
        s=s+a[i][j];
      }
      System.out.print("\nСумма " + (i+1) + "-ой строки матрицы: " + s);
      s=0;
    }
    System.out.print("\nЗадание 4\nПростые числа по строкам: \n");
    int[] p=new int[]{1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    for (int i=0;i < a.length;i++,System.out.println())
    {
      System.out.print("Строка"+(i+1)+": ");
      for (int j=0;j < a[i].length;j++)
      {
        for (int g=0;g < p.length;g++)
        {
        if (a[i][j]==p[g])
        System.out.print(a[i][j]+"; ");
        }
      }
    }
  }
}