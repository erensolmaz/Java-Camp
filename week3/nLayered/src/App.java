import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import core.DatabaseLogger;
import core.FileLogger;
import core.MailLogger;
import core.logger;
import dataAccess.HibernateDataDao;
import dataAccess.JdbcDataDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import entities.User;

public class App {
    public static void main(String[] args) throws Exception {
        logger[] log ={new DatabaseLogger(), new MailLogger(), new FileLogger()};

 

        System.out.println("-----Categories-----");
        Category programlama = new Category(176, "Programlama", "Programlama kategorisi");
        Category programlama1 = new Category(176, "Programlama", "Programlama kategorisi");
        Category diger = new Category(353, "Diger", "Digerleri");

        List<Category> ctl = new ArrayList<>();
        CategoryManager ctm = new CategoryManager(ctl, new JdbcDataDao(), log);
        ctm.add(programlama);
        //System.out.println("-----Exception Kategori isimleri-----");
        //ctm.add(programlama1);
    
        System.out.println("-----Course-----");

        Course java = new Course(1, "Java yetistirme campi", "Programlama", "Engin Demirog", 50);
        Course java1 = new Course(1, "Java yetistirme campi", "Programlama", "Engin Demirog", 50);
        Course dotnet = new Course(2, "Dotnet yetistirme campi", "Programlama", "Engin Demirog", 100);
        Course javascript = new Course(3, "Javascript yetistirme campi", "Programlama", "Engin Demirog", -1);

        List<Course> cml = new ArrayList<>();

        CourseManager cm = new CourseManager(cml, new HibernateDataDao(), log);
        cm.add(java);
        System.out.println("-----Course-----");
        cm.add(dotnet);
        
       /*  System.out.println("-----Exception Kurs isimleri-----");
        cm.add(java1);
        System.out.println("-----Exception Price-----");
        cm.add(javascript);   */







        Instructor egitmen = new Instructor("Engin Demirog", null);

        User kullanici = new User(1, "Eren Solmaz", null, 22);


        System.out.println(programlama.getCategoryName());


     



    }
}
