package com.codersbuffet.watermanagement.constants;

public class WaterManagementConstants {
    public static final int CORPORATION_WATER_FEE = 1;
    public static final double BORE_WELL_WATER_FEE = 1.5;
    public static final int TANKER_0L_TO_500L_FEE = 2;
    public static final int TANKER_501L_TO_1500L_FEE = 3;
    public static final int TANKER_1501L_TO_3000L_FEE = 5;
    public static final int TANKER_3000L_ONWARDS = 8;
    public static final int PERSONS_IN_2BHK = 3;
    public static final int PERSONS_IN_3BHK = 5;
    public static final int TWO_BHK = 2;
    public static final int WATER_CONSUMPTION_PER_HEAD = 10;
    public static final int NUMBER_OF_DAYS_IN_MONTH = 30;
    public static final int TWO_BHK_WATER_PER_MONTH =
            PERSONS_IN_2BHK * WATER_CONSUMPTION_PER_HEAD * NUMBER_OF_DAYS_IN_MONTH;
    public static final int THREE_BHK_WATER_PER_MONTH =
            PERSONS_IN_3BHK * WATER_CONSUMPTION_PER_HEAD * NUMBER_OF_DAYS_IN_MONTH;
}
