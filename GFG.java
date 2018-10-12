class GFG{
static void printFun(int test)
{
    if (test < 1)
        return;
    else
    {
        System.out.printf("%d ",test);
        printFun(test-1); // statement 2
        System.out.printf("%d ",test);
        return;
    }
}

public static void main(String[] args)
{
    int test = 3;
    printFun(test);
    
    //out put here is 3 2 1 1 2 3
}
}