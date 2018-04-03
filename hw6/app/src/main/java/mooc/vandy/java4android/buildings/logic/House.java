package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {

    private String mOwner;
    private boolean mPool;

    /**
     * Constructors
     */
    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        this(length, width, lotLength, lotWidth);
        mOwner = owner;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        this(length, width, lotLength, lotWidth, owner);
        mPool = pool;
    }

    /**
     * Getters
     */
    public String getOwner()
    {
        return mOwner;
    }

    public boolean hasPool()
    {
        return mPool;
    }

    /**
     * Setters
     */
    public void setOwner(String owner)
    {
        this.mOwner = owner;
    }

    public void setPool(boolean pool)
    {
        this.mPool = pool;
    }

    /**
     * toString implementation
     */
    public String toString() {
        String result = "Owner: ";
        if (mOwner != null)
            result += getOwner();
        else
            result += "n/a";
        if (mPool)
            result += "; has a pool";
        if(this.calcLotArea() > 2*this.calcBuildingArea())
            result += "; has a big open space";
        return result;
    }

    /**
     * equals implementation
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof House) {
            House otherHouse = (House) obj;
            if (otherHouse.calcBuildingArea() == this.calcBuildingArea() && otherHouse.hasPool() == this.hasPool())
                return true;
        }
        return false;
    }
    
}
