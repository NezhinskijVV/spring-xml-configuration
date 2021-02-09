package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.service.NotebookService;
import ru.itsjava.service.NotebookServiceImpl;
import ru.itsjava.service.ProgrammerService;
import ru.itsjava.service.ProgrammerServiceImpl;

public class Application {

    public static void main(String[] args) {
//        NotebookService notebookService = new NotebookServiceImpl();
//        ProgrammerService programmerService = new ProgrammerServiceImpl(notebookService);

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-context.xml");

        context.getBean(ProgrammerService.class).printItems();

    }
}
