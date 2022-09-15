package AnnotationConfiguration;

import org.springframework.stereotype.Component;

@Component
public class PlusService {
    public int servicePlus(int a, int b) {
        return a + b;
    }
}