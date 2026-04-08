class Task10
{
    public int AddSub(int input1, int input2)
    {
        int N = input1;
        int opt = input2;
        int result = 0;
        int count = 1;
        for (int i = N; i >= 1; i--) {
            if (opt == 1) {
                if (count % 2 == 1)
                    result += i;
                else
                    result -= i;
            } 
            else {
                if (count == 1 || count % 2 == 0)
                    result += i;
                else
                    result -= i;
            }
            count++;
        }
        return result;
    }
}