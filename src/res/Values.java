package res;

import models.Clopq;
import models.EctsActivity;
import models.EvaluationActivity;
import models.Syllabus;

import java.awt.*;
import java.util.ArrayList;

public class Values {
    final static public int screenHeight = 720;
    final static public int screenWidth = 1280;
    final static public int formWidth = 800;
    final static public int formHeightSmall = 30;
    final static public int formHeightMedium = 38;
    final static public int formHeightLarge = 60;
    final static public int paddingSmall = 10;

    static public class AppColors {
        final static public Color backgroundColor = new Color(0xffffffff);
        final static public Color textColor = new Color(0xff002699);
        final static public Color borderColor = new Color(0xffccd9ff);
        final static public Color primaryColor = new Color(205, 133, 63);
        final static public Color indigo = new Color(50, 80, 130);
        final static public Color grey = new Color(128, 128, 128);
        final static public Color greyLight = new Color(211, 211, 211);
        final static public Color black = Color.black;
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
        static public Syllabus sampleSyllabusObject = new Syllabus(
                0,
                "Principles of Software Engineering",
                "SE 302",
                "Fall",
                3,
                0,
                3,
                5,
                "SE 116 To succeed (To get a grade of at least DD)",
                "English",
                "Required",
                "First Cycle",
                "Yrd. Doç. Dr. Kaya OĞUZ",
                new ArrayList<>() {{
                    add("Yrd. Doç. Dr. Kaya OĞUZ");
                }},
                new ArrayList<>(){{ add(""); }},
                "The objective of this course is to provide students a common understanding of software engineering principles. It is organized so as to, first, provide a general introduction to software development and identify the important phases of any software project. Then, each of the phases is examined in detail, in order to give the student a picture of the current state of software development.",
                new ArrayList<>() {{
                    add("Define engineering, software, computer and system engineering");
                    add("Define software processes");
                    add("Gather the software requirements");
                    add("Define software design and architecture");
                    add("Learn the software verification and validation");
                }},
                "In this course, students learn the theoretical and practical aspects of specification and design, development, verification and validation and testing stages of SE. More, this course enables students to realize software specification and design phases of sample projects with real clients.",
                "Core Courses",
                new ArrayList<>() {{
                    add(new String[]{"Introduction to Software Engineering", "Sommerville, Chapter 01"});
                    add(new String[]{"Software Processes", "Sommerville, Chapter 02"});
                    add(new String[]{"Agile Software Development", "Sommerville, Chapter 03"});
                    add(new String[]{"Requirements Engineering", "Sommerville, Chapter 04"});
                    add(new String[]{"Project Meeting and GUI Programming", ""});
                    add(new String[]{"System Modeling", "Sommerville, Chapter 05"});
                    add(new String[]{"Architectural Design", "Sommerville, Chapter 06"});
                    add(new String[]{"Midterm Exam", ""});
                    add(new String[]{"Project Meeting and Collaborative Development", ""});
                    add(new String[]{"Design and Implementation", "Sommerville, Chapter 07"});
                    add(new String[]{"Project Management", "Sommerville, Chapter 22, 23"});
                    add(new String[]{"Software Testing", "Sommerville, Chapter 08"});
                    add(new String[]{"Project Meeting and Test-Driven Development", ""});
                    add(new String[]{"Software Evolution", "Sommerville, Chapter 09"});
                    add(new String[]{"Project Presentations", ""});
                    add(new String[]{"Review", ""});
                }},
                new ArrayList<>() {{
                    add("Software Engineering 10, Ian Sommerville, 10th Ed. Addison Wesley, 2015, 978-0133943030");
                }},
                new ArrayList<>() {{
                    add("Software Engineering: A Practitioners’s Approach, Roger S. Pressman, McGraw Hill Publishing Co.; 7th Ed edition (2009), ISBN: 9780071267823");
                }},
                new ArrayList<>() {{
                    add(new EvaluationActivity(null, null));
                    add(new EvaluationActivity(null, null));
                    add(new EvaluationActivity(null, null));
                    add(new EvaluationActivity(null, null));
                    add(new EvaluationActivity(null, null));
                    add(new EvaluationActivity(null, null));
                    add(new EvaluationActivity(1, 30));
                    add(new EvaluationActivity(null, null));
                    add(new EvaluationActivity(null, null));
                    add(new EvaluationActivity(1, 30));
                    add(new EvaluationActivity(1, 40));
                }},
                new ArrayList<>() {{
                    add(new EctsActivity(16, 3, 48));
                    add(new EctsActivity(null, null, null));
                    add(new EctsActivity(16, 2, 32));
                    add(new EctsActivity(null, null, null));
                    add(new EctsActivity(null, null, null));
                    add(new EctsActivity(null, null, null));
                    add(new EctsActivity(null, null, null));
                    add(new EctsActivity(1, 40, 40));
                    add(new EctsActivity(null, null, null));
                    add(new EctsActivity(null, null, null));
                    add(new EctsActivity(1, 10, 10));
                    add(new EctsActivity(1, 20, 20));
                }},
                new ArrayList<>() {{
                    add(new Clopq("To have adequate knowledge in Mathematics, Science and Computer Engineering; to be able to use theoretical and applied information in these areas on complex engineering problems.", null));
                    add(new Clopq("To be able to identify, define, formulate, and solve complex Computer Engineering problems; to be able to select and apply proper analysis and modeling methods for this purpose.", 2));
                    add(new Clopq("To be able to design a complex system, process, device or product under realistic constraints and conditions, in such a way as to meet the requirements; to be able to apply modern design methods for this purpose.", 5));
                    add(new Clopq("To be able to devise, select, and use modern techniques and tools needed for analysis and solution of complex problems in Computer Engineering applications; to be able to use information technologies effectively.", 2));
                    add(new Clopq("To be able to design and conduct experiments, gather data, analyze and interpret results for investigating complex engineering problems or Computer Engineering research topics.", null));
                    add(new Clopq("To be able to work efficiently in Computer Engineering disciplinary and multi-disciplinary teams; to be able to work individually", 4));
                    add(new Clopq("To be able to communicate effectively in Turkish, both orally and in writing; to be able to author and comprehend written reports, to be able to prepare design and implementation reports, to present effectively, to be able to give and receive clear and comprehensible instructions.", null));
                    add(new Clopq("To have knowledge about global and social impact of Computer Engineering practices on health, environment, and safety; to have knowledge about contemporary issues as they pertain to engineering; to be aware of the legal ramifications of Computer Engineering solutions.", null));
                    add(new Clopq("To be aware of ethical behavior, professional and ethical responsibility; to have knowledge about standards utilized in engineering applications.", null));
                    add(new Clopq("To have knowledge about industrial practices such as project management, risk management, and change management; to have awareness of entrepreneurship and innovation; to have knowledge about sustainable development.", null));
                    add(new Clopq("To be able to collect data in the area of Computer Engineering, and to be able to communicate with colleagues in a foreign language. (\"European Language Portfolio Global Scale\", Level B1)", null));
                    add(new Clopq("To be able to speak a second foreign language at a medium level of fluency efficiently.", null));
                    add(new Clopq("To recognize the need for lifelong learning; to be able to access information, to be able to stay current with developments in science and technology; to be able to relate the knowledge accumulated throughout the human history to Computer Engineering.", null));
                }}
        );
    }
}
