package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private int mSwinng;

    public Gate()
    {
        mSwinng = Gate.CLOSED;
    }

    public boolean setSwing(int direction)
    {
        this.mSwinng = direction;
        return direction == Gate.IN || direction == Gate.OUT || direction == Gate.CLOSED;
    }

    public boolean open(int direction)
    {
        if (direction == Gate.IN || direction == Gate.OUT)
        {
            return setSwing(direction);
        }
        return false;
    }

    public void close()
    {
        setSwing(Gate.CLOSED);
    }

    public int getSwingDirection()
    {
        return this.mSwinng;
    }

    public int thru(int count)
    {
        if (getSwingDirection() == Gate.IN)
        {
            return count;
        }
        else if (getSwingDirection() == Gate.OUT)
        {
            return -count;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public String toString()
    {
        if (getSwingDirection() == Gate.IN)
        {
            return "This gate is open and swings to enter the pen only";
        }
        else if (getSwingDirection() == Gate.OUT)
        {
            return "This gate is open and swings to exit the pen only";
        }
        else
        {
            return "This gate is closed";
        }
    }


}
