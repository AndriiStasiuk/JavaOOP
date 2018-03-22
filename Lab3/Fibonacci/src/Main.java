package fibonacci;

public class Main {
    public long getNumber(int position) {
        if(position > 0 ) {
            if (position > 2)
                return getNumber(position - 1 ) + getNumber(position-2);
            else
                return 1;
        }
        else
            return -1;
    }

    public Fibonacci(){

    }
}
