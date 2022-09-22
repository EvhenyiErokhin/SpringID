package AnnotationConfiguration;

import org.springframework.stereotype.Service;

@Service("plusService")
public class PlusService {
    public int plusServ(int a, int b) {
        return a + b;
    }
}