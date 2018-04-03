package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mEastGate;

    /**
     * The output Gate object.
     */
    private Gate mWestGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;
    public static final int HERD = 24;


    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    public void simulateHerd(Random rand) {
        int pen = HERD;
        int pasture = 0;
        int randNumber = 0;
        mOut.println("There are currently " + pen + " snails in the pen and " + pasture + " snails in the pasture");
        for (int i =0; i<MAX_ITERATIONS;i++) {
            int direction = 0;
            int count = 0;
            boolean bool;
            if (pen == 0) {
                randNumber = rand.nextInt(pasture)+1;
                count = mWestGate.thru(randNumber);
                pen += count;
            }
            else if(pasture == 0) {
                randNumber = rand.nextInt(pen)+1;
                count = mEastGate.thru(randNumber);
                pen += count;
            }
            else {
                bool = rand.nextBoolean();
                if(bool) {
                    randNumber = rand.nextInt(pen)+1;
                    count = mEastGate.thru(randNumber);
                    pen += count;
                }
                else {
                    randNumber = rand.nextInt(pasture)+1;
                    count = mWestGate.thru(randNumber);
                    pen += count;

                }
            }
            pasture = HERD - pen;
            mOut.println("There are currently " + pen + " snails in the pen and " + pasture + " snails in the pasture");
        }
    }



}
