import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach",Coach.class);

        System.out.println("Memory location for theCoach:"+theCoach);
        System.out.println("Memory location for alphaCoach:"+alphaCoach);

        Boolean isTheSame = (theCoach==alphaCoach);
        String messageCompare = isTheSame?"The same object":"2 differential objects";
        System.out.println(messageCompare);
        if(isTheSame)
            System.out.println("=>Singleton pattern");

        context.close();

    }
}