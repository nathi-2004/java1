class Main{
    static class inner{
        static int n=5;
        static void display()
        {
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++)
                {
                   if (j % 2 == 1) {
                    System.out.print("*");  
                } else {
                    System.out.print("#");  
                    
                }
                
                }
                System.out.println();
            }
            
        }
    }
    
    public static void main(String args[])
    {
                Main.inner.display();
    }
    }


