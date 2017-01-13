package com.book.spring.annotations;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Quang on 01/13/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {spring.annotations.AppConfig.class})
public class SecondAnnotationPersonSaveTest {
}
