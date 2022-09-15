package AnnotationConfiguration;

import org.springframework.stereotype.Component;

@Component
public class MinusService {
    public int serviceMinus(int a, int b) {
        return a - b;
    }
}
