package apps;

import apps.actions.Actions;
import apps.beans.MenuBeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@ComponentScan("apps")
public class MenuApplication {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(MenuApplication.class);

        MenuBeanConfiguration myMenuBeanConfiguration = context.getBean("menuBeanConfiguration", MenuBeanConfiguration.class);

        System.out.println(myMenuBeanConfiguration);

        Actions action = new Actions();

        action.setActions();

        Scanner sc = new Scanner(System.in);

        Integer number = sc.nextInt();

        System.out.println(action.actions.get(number));

    }
}
