package com.filrob.wot.domain.cards.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class Main {

    @Autowired
    private Test1Repo test1Repo;

    @Autowired
    private Test2Repo test2Repo;

    @Autowired
    private TestMastaRepo testMastaRepo;

    @GetMapping("/postTest")
    public String postTest() {
        doSomethingAfterStartup();
        return "done";
    }

    @GetMapping("/get")
    public String getAll() {
        Iterable<TestMasta> testMastas =  testMastaRepo.findAll();
        for (TestMasta test : testMastas) {
            System.out.println(test);
        }
        return "tadam";
    }


    public void save1(Test1 test1) {
//        test1Repo.save(test1);
        testMastaRepo.save(test1);
    }

    public void save2(Test2 test2) {
//        test2Repo.save(test2);
        testMastaRepo.save(test2);
    }

    public void doSomethingAfterStartup() {
        Test1 test1 = new Test1();
        test1.setCardName("Name1");
        test1.setBla(1);
        save1(test1);

        Test2 test2 = new Test2();
        test2.setCardName("Name2");
        test2.setMedalValue(2);
        save2(test2);
        System.out.println("hello world, I have just started up");
    }

}
