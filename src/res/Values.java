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
        final static public Color primaryColor = new Color(205, 133, 63);
        final static public Color indigo = new Color(50, 80, 130);
        final static public Color grey = new Color(128, 128, 128);
        final static public Color greyLight = new Color(211, 211, 211);
    }

    static public class SyllabusValues {
        static public String[] semesters = {"Fall", "Spring", "Summer"};
        static public String[] courseTypes = {"Required", "Service Course"};
        static public String[] courseLevels = {"First Cycle", "Second Cycle", "Third Cycle"};
        static public String[] courseCategories = {
                "Core Courses",
                "Major Area Courses",
                "Supportive Courses",
                "Media and Management Skills Courses",
                "Transferable Skill Courses"};
    }
}
