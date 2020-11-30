class FitzQuark
{
    static FitzQuark CountFitzQuak = new FitzQuak;

    static boolean OutlayIsNumber(int _Number)
    {
        if      (_Number%5 == 0 || _Number%7 == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    static void Outlay(int _Number)
    {
        if      (OutlayIsNumber(_Number))
        {
            System.out.println(_Number);
        }
        else if (_Number%5 == 0 && _Number%7 !=0)
        {
            System.out.println("Fitz");
        }
        else if (_Number%5 != 0 && _Number%7 ==0)
        {
            System.out.println("Quark");
        }
        else
        {
            System.out.println("FitzQuark");
        }
    }

    static void IndexCounter()
    {
        int     IndexNumber = 1;

        while   (IndexNumber < 101)
        {
            Outlay(IndexNumber);
        }

        IndexNumber++;
    }

    static void main(String[] args)
    {
        IndexCounter();
    }
}