package com.regionlocker;

import com.google.common.collect.ImmutableMap;
import lombok.Getter;

import java.util.Map;

@Getter
public enum TrailblazerRegion
{
    //<editor-fold desc="Enums">
    NONE("None", ""),
    MISTHALIN("Misthalin", "12079, 12335, 12080, 12336, 12592, 12337, 12593, 12849, 12338, 12594, 12850, 12339, 12595, 12851, 12340, 12596, 12852, 13108, 13364, 12341, 12597, 12853, 13109, 13365, 12342, 12598, 12854, 13110, 13366, 13622, 14142, 14398, 14654, 14910, 15166, 14653, 14909, 14652, 14908, 15164, 14395, 14651, 14907, 15163, 14394, 14650, 14906, 15162, 14393, 14905, 15418"),
    KARAMJA("Karamja", "11315, 11314, 10802, 11058, 10801, 11057, 11313, 11569, 11825, 11056, 11312, 11568, 11055, 11311, 11567, 11823, 11054, 11310, 11566, 11822,11053, 11309, 11565, 11821"),
    ASGARNIA("Asgarnia", "12081, 12082, 12083, 12084, 12085, 12086, 11824, 11825, 11826, 11826, 11826, 11827, 11828, 11829, 11830, 11570, 11571, 11572,11573, 11574, 11575, 11576, 11577, 11578, 11579, 11316, 11317, 11318, 11319, 11320, 11321, 11322, 11323, 11060, 11061, 11062, 11063, 10537, 10536 "),
    FREMENNIK("Fremennik Provinces", "11064, 11065, 11066, 11067, 11068, 11069, 11325, 11326, 11581, 10808, 10809, 10810, 10810, 10811, 10812, 10552, 10553, 10554, 10555, 10556, 10557, 10558, 10559, 10296, 10297, 10298, 10299, 10300, 10301 , 10040, 10041, 10042, 10043, 10044, 10045, 9790, 9531, 9532, 9275, 9276, 9023, 8763, 8508, 8509, 8252, 8253"),
    KANDARIN("Kandarin", "10803, 10804, 10805, 10806, 10807, 11562, 11050, 11051, 10794, 10795, 10542, 10543, 10544, 10544, 10545, 10546, 10547, 10548, 10549, 10550, 10551, 10284, 10285, 10286, 10287, 10288, 10289, 10290, 10290, 10291, 10292, 10293, 10294, 10295, 10028, 10029, 10030, 10031, 10032, 10033, 10034, 10035, 10036, 10037, 10038, 10039, 9772, 9773, 9774, 9775, 9776, 9777, 9778, 9779, 9780, 9781, 9782, 9783, 9519, 9520, 9521, 9522, 9523, 9524, 9525, 9526, 9527, 9528, 9270, 9271, 9272, 9273, 9014, 9015, 9016, 9017, 9263"),
    DESERT( "Desert", "13107, 13363, 13106, 13362, 13105, 13361, 13617, 12848, 13104, 13360, 13616, 13872, 12591, 12847, 13103, 13359, 13615, 12590, 12846, 13102, 13358, 13614, 12589, 12845, 13101, 13357, 13613, 12844, 13100, 13356, 12843, 13099"),
    MORYTANIA("Morytania", "13622, 13623, 13624, 13878, 14135, 14391, 14647, 14393, 15159, 14903, 13879, 14134, 14390, 14646, 14902, 15158, 13621, 13877, 14133, 14389, 14645, 14901, 13620, 13876, 14132, 14388, 14388, 14644, 14900, 13619, 13875, 14131, 14387, 14643, 14899, 13618, 13874, 14130, 14130, 14386, 14642, 14898, 13873, 14129, 14385, 14385, 14641, 14897, 14639, 14895, 15151, 15407, 14638, 14894, 15150, 15406, 14637, 15149, 15405, 15148"),
    TIRANNWN("Tirannwn", "9264, 9265, 9266, 9267, 9268, 9269, 9007, 9008, 9009, 9010, 9011, 9012, 9013, 8751, 8752, 8753, 8754, 8755, 8756, 8757,8495, 8496, 8497, 8487, 8498, 8499, 8500, 8501"),
    WILDERNESS("Wilderness", "13367, 13368, 13369, 13370, 13371, 13372, 13373, 13111, 13112, 13113, 13114, 13115, 13116,13117, 12855, 12856, 12857, 12858, 12859, 12860, 12861, 12599, 12600, 12601, 12602, 12603, 12604, 12605, 12343, 12344, 12345, 12346, 12347, 12348, 12349, 12087, 12088, 12089, 12090, 12091, 12092, 12093, 11831, 11832, 11833, 11834, 11835, 11836, 11837"),
    LOWER_ZEAH("Lower Zeah", "5685, 5686, 5687, 5688, 5689, 5941, 5942, 5943, 5944, 5945, 6197, 6198, 6199, 6200, 6201, 6453, 6454, 6455, 6456, 6457, 6709, 6710, 6711, 6712, 6713, 6965, 6966, 6967, 6968, 6969, 7221, 7222, 7223, 7224, 7225, 7478, 7479"),
    UPPER_ZEAH("Upper Zeah", "5690, 5691, 5692, 5693, 5946, 5947, 5948, 5949, 5050, 6202, 6203, 6204, 6206, 6205, 6207, 6458, 6458, 6459, 6460, 6461, 6462, 6463, 6714, 6715, 6716, 6717, 6718, 6719, 6970, 6971, 6972, 6973, 6974, 7226, 7227, 7228, 7229, 7484, 7485"),
    KEBOS("Kebos", "4662, 4663, 4664, 4665, 4666, 4667, 4918, 4919, 4920, 4921, 4922, 4923, 4924, 5174, 5175, 5176, 5177, 5178, 5179, 5180, 5430, 5431, 5432, 5433, 5434, 5435, 5436");

    public static final Map<String, TrailblazerRegion> trailblazerRegions;
    static
    {
        ImmutableMap.Builder<String, TrailblazerRegion> builder = new ImmutableMap.Builder<>();

        for (TrailblazerRegion region : values())
        {
            builder.put(region.getName(), region);
        }

        trailblazerRegions = builder.build();
    }

    public final String name;
    public final String regions;

    TrailblazerRegion(String name, String regions)
    {
        this.name = name;
        this.regions = regions;
    }
}