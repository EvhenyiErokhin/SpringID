package AnnotationConfiguration;

import org.springframework.stereotype.Service;

@Service("minusService")
public class MinusService {
    public int minusServ(int a, int b) {
        return a - b;
    }
}
