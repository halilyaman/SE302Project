package res;

import java.awt.*;
import java.util.ArrayList;

public class Values {
    final static public int screenHeight = 720;
    final static public int screenWidth = 1280;
    final static public int formWidth = 800;
    final static public int formHeightSmall = 30;
    final static public int formHeightMedium = 60;
    final static public int paddingSmall = 10;

    static public class AppColors {
        final static public Color backgroundColor = new Color(0xffffffff);
        final static public Color textColor = new Color(0xff002699);
        final static public Color borderColor = new Color(0xffccd9ff);
    }

    static public class SyllabusValues {
        static public String[] semesters = {"Fall", "Spring", "Summer"};
        static public String[] courseTypes = {"Required", "Service Course"};
        static public String[] courseLevels = {"First Cycle", "Second Cycle", "Third Cycle"};
    }
}
