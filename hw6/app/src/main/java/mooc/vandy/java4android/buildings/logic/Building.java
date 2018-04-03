package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    /**
     * Constructor
     */
    public Building(int length, int witdth, int lotLength, int lotWidth)
    {
        this.mLength = length;
        this.mWidth = witdth;
        this.mLotLength = lotLength;
        this.mLotWidth = lotWidth;
    }

    /**
     * Getters
     */
    public int getLength()
    {
        return mLength;
    }

    public int getWidth()
    {
        return mWidth;
    }

    public int getLotLength()
    {
        return mLotLength;
    }

    public int getLotWidth()
    {
        return mLotWidth;
    }

    /**
     * Setters
     */
    public void setLength(int mLength)
    {
        this.mLength = mLength;
    }

    public void setWidth(int mWidth)
    {
        this.mWidth = mWidth;
    }

    public void setLotLength(int mLotLength)
    {
        this.mLotLength = mLotLength;
    }

    public void setLotWidth(int mLotWidth)
    {
        this.mLotWidth = mLotWidth;
    }

    /**
     * Calculate Building Area
     */
    public int calcBuildingArea()
    {
        return mLength *  mWidth;
    }


    /**
     * Calculate Lot Area
     */
    public int calcLotArea()
    {
        return mLotLength * mLotWidth;
    }

    /**
     * toString implementation
     */
    @Override
    public String toString()
    {
        return "Building";
    }
    
}
